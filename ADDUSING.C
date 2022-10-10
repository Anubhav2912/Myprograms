#include<stdio.h>
#include<conio.h>
void main() {
	int a,b,*ptr1,*ptr2,sum;
	clrscr();
	printf("\t\t\t\tAddition Using Pointer");
	printf("\nEnter First Number : ");
	scanf("%d", &a);
	printf("\nEnter Second Number : ");
	scanf("%d", &b);
	ptr1= &a;
	ptr2= &b;
	sum = *ptr1 + *ptr2;
	printf("\nThe sum is : %d", sum);
	getch();
}