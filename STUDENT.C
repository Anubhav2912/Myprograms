#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Student {
	int roll;
	char name[50];
	int std;
	int age;
};

int main() {
	struct Student *st;
	FILE *fptr;
	fptr=fopen("myfile","w");
	if(fptr == NULL) {
		printf("\n File cann't be opened");
	} else {
	/*
		printf("Enter Name:");
		scanf("%s", &st->name);
		printf("\nEnter Roll No.:");
		scanf("%d",&st->roll);
		printf("Enter Standard:");
		scanf("%d",&st->std);
		printf("Enter Age:");
		scanf("%d",&st->age);
		fwrite	(st,sizeof(struct Student),1,fptr);
	*/
		fprintf(fptr,"I am Anu");
		fclose(fptr);
	}
	getch();
}