#include<stdio.h>
#include<conio.h>
void main() {
	int i=1;
	clrscr();
	printf("Odd Numbers from 1 to 100");
	for(i=1;i<=100;i=i+2) {
		printf("\n%d", i);
	}
	getch();
}