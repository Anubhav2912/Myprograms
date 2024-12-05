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

void modify(int odata,int ndata) {
	int found=0;
	if(start==NULL) {
		printf("\nLinkedList Does not Exist..");
	} else {
		for(temp=start;temp!=NULL;temp=temp->next){
			if(temp->data==odata) {
				temp->data=ndata;
				found=1;
				break;
			}
		}
		if(found==0) {
			printf("Data Not found");
		}
	}
}

void main() {
	int val,odata,ndata;
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
	printf("\nEnter data to modify : ");
	scanf("%d", &odata);
	printf("\nEnter New data : ");
	scanf("%d", &ndata);
	modify(odata,ndata);
	printf("\n Modified list..\n");
	display();
	getch();
}

