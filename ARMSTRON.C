#include<stdio.h>
#include<conio.h>

void main() {
	int n, dup, newno=0, digit;
	clrscr();
	printf("\nEnter a number :");
	scanf("%d",&n);
	dup = n;
	do {
		digit = n % 10;
		newno = newno + digit*digit*digit;
		n = n/10;
	} while(n!=0);
	if(newno == dup) {
		printf("\n%d is Armstrong Number",dup);
	} else {
		printf("\n %d is not an Armstrong Number",dup);
	}
	getch();

}