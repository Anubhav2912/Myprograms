#include<stdio.h>
#include<conio.h>
void main() {
	int a[5],b[5],c[5],d[5],e[5],f[5],i;
	clrscr();
	printf("Enter First Five Numbers:\n ");
	for(i=0;i<5;i++) {
		scanf("%d", &a[i]);
	}
	printf("\nEnter Second Five Numbers:\n ");
	for(i=0;i<5;i++) {
		scanf("%d", &b[i]);
	}
	for(i=0;i<5;i++) {
		c[i]=a[i]+b[i];
	}
	printf("\nTheir Consecutive sum is:");
	for(i=0;i<5;i++) {
		printf("\n %d\n", c[i]);
	}
	printf("\nTheir Consecutive sum is:");
	for(i=0;i<5;i++) {
		printf("\n %d\n", c[i]);
	}
	for(i=0;i<5;i++) {
		d[i]=a[i]-b[i];
	}
	printf("\nTheir Consecutive difference is:");
	for(i=0;i<5;i++) {
		printf("\n %d\n", d[i]);
	}
	for(i=0;i<5;i++) {
		e[i]=a[i]*b[i];
	}
	printf("\nTheir Consecutive product is:");
	for(i=0;i<5;i++) {
		printf("\n %d\n", e[i]);
	}
	for(i=0;i<5;i++) {
		f[i]=a[i]/b[i];
	}
	printf("\nTheir Consecutive division is:");
	for(i=0;i<5;i++) {
		printf("\n %d\n", f[i]);
	}
	getch();
}