#include<stdio.h>
#include<conio.h>
void main() {
	int i,a,b,c=1;
	clrscr();
	printf("Enter First No.:");
	scanf("%d", &a);
	printf("Enter Second No.:");
	scanf("%d", &b);
	for(i=1;i<=b;i++){
		c=c*a;
	}
	printf("The answer is:%d", c);
	getch();
}