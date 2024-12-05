#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Node {
	int data;
	struct Node *next;
	struct Node *prev;
};
struct Node *start=NULL, *temp, *last;
void insert(int arg) {
	if(start==NULL) {
		start=(struct Node *)malloc(sizeof(struct Node));
		start->data=arg;
		start->next=NULL;
		start->prev=NULL;
		last=start;
	} else {
		temp=(struct Node *)malloc(sizeof(struct Node));
		temp->data=arg;
		temp->next=NULL;
		temp->prev=last;
		last->next=temp;
		last=temp;
	}
}
void display() {
	if(start==NULL) {
		printf("Linkedlist does not exist..");
	} else {
		printf("\nPREV\tDATA\tNEXT");
		for(temp=start;temp!=NULL;temp=temp->next) {
			printf("\n%u\t%d\t%u",temp->prev,temp->data,temp->next);
		}
	}
}
void main() {
	int val,ch;
	clrscr();
	do {
		printf("\nEnter a number : \n");
		scanf("%d", &val);
		insert(val);
		printf("\nContinue -> 0/1:");
		scanf("%d",&ch);
	}while(ch!=0);
	display();
	getch();
}