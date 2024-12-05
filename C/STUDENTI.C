#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Student {
	int rollno;
	char name[50];
	int age;
	int std;
};

int main() {
	int i;
	int ch;
	struct Student sd[10];
	FILE *fptr;
	fptr=fopen("strecord.txt","a");
	do {
		printf("\nEnter Student's Roll no.: ");
		scanf("%d", &sd[i].rollno);
		printf("\nEnter Student's name: ");
		scanf("%s",sd[i].name);
		printf("\nEnter Student's Age: ");
		scanf("%d", &sd[i].age);
		printf("\nEnter Student's standard: ");
		scanf("%d", &sd[i].std);
		fprintf(fptr,"\n%d\t%s\t%d\t%d", sd[i].rollno,sd[i].name,sd[i].age,sd[i].std);
		printf("\n\n\n Do you want to continue ...Y/N...");
		ch = getche();
		i++;
	}while(ch=='Y' || ch=='y');
	fclose(fptr);
	printf("\nRecord Saved Successfully..");
	getch();
	return 0;
}
