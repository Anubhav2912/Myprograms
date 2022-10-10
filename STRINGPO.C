#include<stdio.h>
#include<stdlib.h>
#include<conio.h>

void main() {
	char ch, str[250];
	//int i=0;
	/**
	do {
		ch = getchar();
		str[i] = ch;
		i++;
	}while(ch!='\n');
	**/
	clrscr();
	printf("Enter a paragraph\n");
	gets(str);
	printf("\nEntered paragraph is.............\n");
	//puts(str);
	printf("%s",str);
	getch();
}