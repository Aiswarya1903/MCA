#include<stdio.h>
#include<stdlib.h>

int i,num,pos,choice=1,size=-1,a[100],ch=1;

void create();
void insertion();
void deletion();
void display();
void search();
void reverse();
void sort();


void main(){
    create();
    while(ch!=7){
        printf("\n---ARRAY OPERATIONS---\nenter the option:\n1.Create\n2.Insertion\n3.Deletion\n4.Search\n5.Reverse\n6.sort\n7.exit");
        scanf("%d",&ch);
        switch(ch){
            case 1:create();
                break;
            case 2:insertion();
                break;
            case 3:deletion();
                break;
            case 4:search();
                break;
            case 5:reverse();
                break;
            case 6:sort();
                break;
            case 7:
                printf("program stopped!");
                break;
            default:
                printf("invlaid choice! enter valid choice..");
                break;
        }
    }
    
}
//CREATION
void create(){
    printf("enter the size of the array:");
    scanf("%d",&size);
    printf("enter the elements of the array:");
    for(i=0;i<size;i++){
        scanf("%d",&a[i]);
    }
}

//insertion at beginning
void insertbeg(){
    for(i=size;i>=0;i--){
        a[i+1]=a[i];
    }
    a[0]=num;
    size++;
}

//insertion at end
void insertend(){
    a[size]=num;
    size++;
}

//insertion at specified position
void insertpos(){
    printf("specify the position:");
    scanf("%d",&pos);
    if(pos<0 || pos>size){
        printf("invalid position");
    }
    else{
        pos--;
        for(i=size;i>pos;i--){
            a[i]=a[i-1];
        }
        a[pos]=num;
        size++;
    }
    
}

//INSERTION
void insertion(){
    printf("enter the element to be inserted:");
    scanf("%d",&num);
    printf("enter your choice:\n1.At beginning.\n2.At end.\n3.At position\n");
    scanf("%d",&ch);
    switch(ch){
        case 1:insertbeg();
            break;
        case 2:insertend();
            break;
        case 3:insertpos();
            break;
        default:
            printf("invalid choice");
            break;
    }
}

//deletion at begining
void deletebeg(){
    for(i=0;i<size;i++){//shifting elements towards left
        a[i]=a[i+1];
    }
    size--;
}
void deleteend(){
    size--;
}
void deletepos(){
    printf("enter the position:");
    scanf("%d",&pos);
    if(pos<0 || pos>size){
        printf("invalid position");
    }
    else{
        pos--;
        for(i=pos;i<size;i++){
            a[i]=a[i+1];
        }
        size--;
    }    
}

//DELETION
void deletion(){
    if(size==0){
        printf("the array is empty!");
        return;
    }
    printf("enter the operation:\n1.Deletion at beginning.\n2.Deletion at end\n3.Deletion at position.\n");
    scanf("%d",&ch);
    switch(ch){
        case 1:deletebeg();
            break;
        case 2:deleteend();
            break;
        case 3:deletepos();
            break;
        default:
            printf("invalid choice");
            break;
    }
}

void search(){
    int found=0;
    printf("enter the element to be searched:");
    scanf("%d",&num);
    for(i=0;i<size;i++){
        if(a[i]==num){
            printf("%d is found at position %d",num,i+1);
            found=1;
        }
    }
    if(!found){
        printf("%d is not found ",num);
        }
}
void reverse(){
    int i=0;
    int n=size-1;
    while(i<n){
        //swapping
        int temp=a[i];
        a[i]=a[n];
        a[n]=temp;
        i++;//moving forward
        n--;//moving backward
    }
}

void sort(){
    for(i=0;i<size;i++){
        for(int j=0;j<size-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    printf("array sorted successfully!\n");
    display();
}

void display(){
    if(size<=0)
    {
        printf("the array is empty!");
        return;
    }
    printf("the elements are:");
    for(i=0;i<size;i++){
        printf("%d ",a[i]);
    }
}
