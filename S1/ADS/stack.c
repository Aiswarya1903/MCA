#include <stdio.h>
#define max 5

void push();
void pop();
void peek();
void display();

int top = -1, stack[max];

void main()
{
    int ch;
    while (ch != 4)
    {
        printf("\nenter the option:\n1.Push\n2.Pop\n3.Peek\n4.Exit\n");
        printf("option:");
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
            printf("program stopped!");
            break;
        default:
            printf("enter valid option!");
            break;
        }
    }
}

void push()
{
    int data;
    if (top >= max - 1)
    {
        printf("stack overflow!");
    }
    else
    {
        top++;
        printf("enter the element to be pushed:");
        scanf("%d", &data);
        stack[top] = data;
    }
    display();
}

void pop()
{
    if (top == -1)
    {
        printf("stack underflow!\n");
    }
    else
    {
        printf("popped element %d", stack[top]);
        top--;
    }
    display();
}

void peek()
{
    if (top == -1)
    {
        printf("underflow");
    }
    else
    {
        printf("element is %d", stack[top]);
    }
}

void display()
{
    if (top == -1)
    {
        printf("stack underflow!");
    }
    else
    {
        printf("\nthe elements are:\n");
        for (int i = top; i >= 0; i--)
        {
            printf("%d\n", stack[i]);
        }
    }
}