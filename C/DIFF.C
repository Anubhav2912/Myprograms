#include<stdio.h>
#include<conio.h>
void main() {
	int a,b,c;
	clrscr();
	printf("Enter first no.");
	scanf("%d", &a);
	printf("Enter second no.");
	scanf("%d", &b);
	c=a-b;
	printf("the difference is:%d", c);
	getch();
}