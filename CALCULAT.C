#include<stdio.h>
#include<conio.h>
void main() {
	int i,a,b,c,process,r1,r2,gcd,lcm,small;
	clrscr();
	printf("Enter First No.:");
	scanf("%d", &a);
	printf("Enter Second No.:");
	scanf("%d", &b);
	printf("\n\t\t\t\tChoose Option");
	printf("\n\t\t\t\t1 Add");
	printf("\n\t\t\t\t2 Subtract");
	printf("\n\t\t\t\t3 Multiply");
	printf("\n\t\t\t\t4 Divide");
	printf("\n\t\t\t\t5 Mod");
	printf("\n\t\t\t\t6 GCD and LCM");
	scanf("%d", &process);
	if(process == 1) {
		c=a+b;
		printf("Answer is:%d", c);
	}
	else if(process == 2) {
		c=a-b;
		printf("Answer is:%d", c);
	}
	else if(process == 3) {
		c=a*b;
		printf("Answer is:%d", c);
	}
	else if(process == 4) {
		c=a/b;
		printf("Answer is:%d", c);
	}
	else if(process == 5) {
		c=a%b;
		printf("Answer is:%d", c);
	}
	else if(process == 6) {
		if(a<b) {
			small=a;

		} else {
			small=b;
		}
		for(i=small;i>=1;i--){
			r1=a%i;
			r2=b%i;
			if(r1==0 && r2==0) {
				gcd=i;
				break;
			}
		}
		lcm=a*b/gcd;
		printf("GCD is:%d", gcd);
		printf("\nLCM is:%d", lcm);



	}
	getch();
}