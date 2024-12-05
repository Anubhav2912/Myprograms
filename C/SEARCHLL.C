#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
struct Node {
	int data;
	struct Node *next;
};

struct Node *start=NULL, *temp, *last;

void insert(int arg){
	if(start==NULL){
		start=(struct Node *)malloc(sizeof(struct Node));
		start->data=arg;
		start->next=NULL;
		last=start;
	} else {
		temp=(struct Node *)malloc(sizeof(struct Node));
		temp->data=arg;
		temp->next=NULL;
		last->next=temp;
		last=temp;
	}
}


void display() {
	if(start==NULL) {
		printf("\nLinkedList Does not Exist..");
	} else {
		for(temp=start;temp!=NULL;temp=temp->next){
			printf("\n%d", temp->data);
		}
	}
	getch();
}

int search(int sdata) {
	if(start==NULL) {
		printf("\nLinkedList Does not Exist..");
	} else {
		for(temp=start;temp!=NULL;temp=temp->next){
			if(temp->data==sdata) {
				return 1;

			}
		}
	}
	return 0;
}

void main() {
	int val,sdata,found;
	clrscr();
	printf("\nEnter a value : ");
	scanf("%d", &val);
	insert(val);
	display();
	printf("\nEnter a value : ");
	scanf("%d", &val);
	insert(val);
	display();
	printf("\nEnter a value : ");
	scanf("%d", &val);
	insert(val);
	display();
	printf("\nEnter data to search..");
	scanf("%d",&sdata);
	found = search(sdata);
	if(found==0) {
		printf("\n Not Found");
	} else {
		printf("\n Found");
	}
	getch();
}

