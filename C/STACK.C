#include<stdio.h>
#include<conio.h>
struct Node {
	int data;
	struct Node *next;
};

struct Node *start=NULL, *temp;

void push(int arg){
	if(start==NULL){
		start=(struct Node *)malloc(sizeof(struct Node));
		start->data=arg;
		start->next=NULL;
	} else {
		temp=(struct Node *)malloc(sizeof(struct Node));
		temp->data=arg;
		temp->next=start;
		start=temp;
	}
}

int pop() {
	int val;
	if(start==NULL) {
		printf("\nStack is empty..");
	} else {
		val = start->data;
		start = start->next;
	}
	return val;
}

void display() {
	if(start==NULL) {
		printf("\nStack is empty..");
	} else {
		for(temp=start;temp!=NULL;temp=temp->next){
			printf("\n%d", temp->data);
		}
	}
	getch();
}

void main() {
	int val,ch;
	do {
		clrscr();
		printf("\n              STACK MENU");
		printf("\n              1.  push");
		printf("\n              2.  pop");
		printf("\n              3.  Exit");
		printf("\n\n\n              Your Choice Please [1/2/3].....:");
		scanf("%d",&ch);
		switch(ch) {
			case 1:
				printf("\nEnter a value : ");
				scanf("%d", &val);
				push(val);
				display();
				break;

			case 2:
				val = pop();
				printf("\nLast poped value is %d",val);
				display();
				break;

			case 3:
				printf("\n Bye Bye..");
				exit(-1);
				default:
				printf("\nWrong Choice");
				break;

		}
	} while (ch!=3);
}