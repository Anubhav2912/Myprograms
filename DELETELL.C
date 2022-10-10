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

void deleteData(int sdata) {
	struct Node *prev;
	int found = 0;
	if(start==NULL) {
		printf("\nLinkedList Does not Exist..");
	} else {
		if(start->data==sdata) {
			start=start->next;
		} else {
			prev= start;
			for(temp=start;temp!=NULL;temp=temp->next) {
				if(temp->data==sdata) {
					prev->next=temp->next;
					found = 1;
				}
				prev = temp;
			}
			if(found==0) {
				printf("Not Found");
			}
		}
	}
}

void main() {
	int val,sdata;
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
	printf("\nEnter data to delete..");
	scanf("%d",&sdata);
	deleteData(sdata);
	printf("\nNew List\n");
	display();
	getch();
}

