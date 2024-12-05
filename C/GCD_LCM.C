#include<stdio.h>
#include<conio.h>
void main() {
	int i,n1,n2,smaller,r1,r2,gcd,lcm;
	clrscr();
	printf("Enter First No.:");
	scanf("%d", &n1);
	printf("Enter Second No.:");
	scanf("%d", &n2);
	if(n1>n2){
		smaller=n2;
	} else {
		smaller=n1;
	}
	for(i=smaller;i>=1;i--){
		r1=n1%i;
		r2=n2%i;
		if(r1==0 && r2==0){
			gcd=i;
			break;
		}
	}
	lcm=n1*n2/gcd;
	printf("LCM is :%d", lcm);
	printf("\nGCD is :%d", gcd);
	getch();





}