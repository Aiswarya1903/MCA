#include <stdio.h>
#include <stdlib.h>

struct node
{
    int data;
    struct node *next;
};

struct node *top = NULL, *newnode;

void push();
void pop();
void peek();
void display();

void main()
{
    int ch;
    while (ch != 5)
    {
        printf("enter the operation:\n1.push\n2.pop\n3.peek\n4.display\n5.exit");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            push();
            break;
        case 2:
            pop();
            break;
        case 3:
            peek();
            break;
        case 4:
            display(top);
            printf("\n");
            break;
        case 5:
            printf("program stopped!");
            break;
        default:
            printf("invalid choice!");
            break;
        }
    }
}

void push()
{
    newnode = malloc(sizeof(struct node));
    printf("enter the data:");
    scanf("%d", &newnode->data);
    newnode->next = top;
    top = newnode;
}

void pop()
{
    if (top == NULL)
    {
        printf("empty stack");
    }
    else
    {
        struct node *temp;
        temp = top;
        top = top->next;
        printf("deleted element %d", temp->data);
        free(temp);
    }
}

void peek()
{
    if (top == NULL)
    {
        printf("empty stack");
    }
    else
    {
        printf("%d", top->data);
    }
}

void display(struct node *top)
{
    if (top == NULL)
    {
        return;
    }
    else
    {
        printf("%d", top->data);
        display(top->next);
    }
}