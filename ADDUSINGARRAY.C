#include<stdio.h>
#include<conio.h>
void main() {
	int a[10],i,sum=0;
	clrscr();
	printf("Enter the values: ");
	for(i=0;i<10;i++)
	scanf("%d", &a[i]);
	for(i=0;i<10;i++)
	sum=sum+a[i];
	printf("\nThe sum is:%d", sum);
	getch();

}
