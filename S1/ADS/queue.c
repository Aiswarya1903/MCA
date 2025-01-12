#include <stdio.h>
#define max 5

void enqueue();
void dequeue();
void display();

int front = -1, rear = -1, queue[max];

void main()
{
    int ch;
    while (ch != 4)
    {
        printf("\nenter the operation:\n1.Enqueue\n2.Dequeue\n3.Display\n4.Exit\nchooseoption:");
        scanf("%d", &ch);
        switch (ch)
        {
        case 1:
            enqueue();
            break;
        case 2:
            dequeue();
            break;
        case 3:
            display();
            break;
        case 4:
            printf("program stopped!");
            break;
        default:
            printf("enter valid choice!");
            break;
        }
    }
}

void enqueue()
{
    if (rear >= max - 1)
    {
        printf("queue overflow!\n");
    }
    else
    {
        int data;
        printf("enter data:");
        scanf("%d", &data);
        if (front == -1)
        {
            rear = 0;
            front = 0;
            queue[rear] = data;
        }
        else
        {
            rear++;
            queue[rear] = data;
        }
    }
    display();
}

void dequeue()
{
    if (front == -1 && rear == -1)
    {
        printf("queue underflow");
    }
    else
    {
        int data;
        data = queue[front];
        if (front == rear)
        {
            rear = -1;
            front = -1;
        }
        else
        {
            front++;
        }
        printf("element removed is: %d\n", data);
    }
    display();
}

void display()
{
    if (front == -1)
    {
        printf("queue is empty");
    }
    else
    {
        for (int i = front; i <= rear; i++)
        {
            printf("%d ", queue[i]);
        }
    }
}