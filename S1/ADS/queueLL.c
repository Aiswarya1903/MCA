#include<stdio.h>
#include<stdlib.h>

struct node{
    int data;
    struct node *next;
}*newnode,*temp;

struct node *rear=NULL;
struct node *front=NULL;

void enqueue();
void dequeue();
void display();

void main(){
    int ch;
    while(ch!=4){
        printf("enter your choice:\n1.enqueue\n2.dequeue\n3.display\n4.exit\n");
        scanf("%d",&ch);
        switch(ch){
            case 1:enqueue();
                break;
            case 2:dequeue();
                break;
            case 3:display();
                break;
            case 4:
                printf("program stopped");
                break;
            default:
                printf("enter valid choice");
                break;
        }
    }
}

void enqueue(){
    newnode=malloc(sizeof(struct node));
    printf("enter data:");
    scanf("%d",&newnode->data);
    newnode->next=NULL;
    if(rear==NULL){
        rear=front=newnode;
    }
    else{
        rear->next=newnode;
        rear=newnode;
    }
}

void dequeue(){
    if(front==NULL){
        printf("empty queue");
    }
    else if(front==rear){
        front=NULL;
        rear=NULL;
    }
    else{
        temp=front;
        front=front->next;
        free(temp);
    }
}

void display(){
    temp=front;
    while(temp!=NULL){
        printf("%d ",temp->data);
        temp=temp->next;
    }
}