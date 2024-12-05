#include<stdio.h>
#include<conio.h>
void main() {
	int n;
	clrscr();
	printf("Enter a Number :`");
	scanf("%d", &n);
	if(n==2||n==3||n==5||n==7) {
		printf("The number is prime");
	}
	else if(n%2==0||n%3==0||n%5==0||n%7==0) {
		printf("The number is composite");
	}
	else {
		printf("The number is prime");
	}
	getch();

}