#include<stdio.h>
#include<conio.h>
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

void main() {
	int val;
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
	printf("\nEnter a value : ");
	scanf("%d", &val);
	insert(val);
	display();


}