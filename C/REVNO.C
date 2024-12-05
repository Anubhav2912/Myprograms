#include<stdio.h>
#include<conio.h>

void main() {
	int n, revno=0, digit;
	clrscr();
	printf("\nEnter a number :");
	scanf("%d",&n);
	do {
		digit = n % 10;
		revno = revno * 10 + digit;
		n = n/10;
	} while(n!=0);
	printf("\nREverse Number is :%d",revno);
	getch();

}