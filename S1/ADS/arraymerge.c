#include<stdio.h>
#include<stdlib.h>

void main(){
    int n,m;
    printf("enter the size of the first array:");
    scanf("%d",&n);
    printf("enter the elements of the second array:");
    scanf("%d",&m);
    int a[n],b[m],c[n+m],i,index=0;
    printf("enter the elements of first array:\n");
    for(i=0;i<n;i++){
        printf("a[%d]=",i);
        scanf("%d",&a[i]);
    }
    printf("enter the elements of second array:\n");
    for(i=0;i<m;i++){
        printf("b[%d]=",i);
        scanf("%d",&b[i]);
    }
    //merged array
    for(i=0;i<n;i++){
        c[index++]=a[i];
    }
    for(i=0;i<m;i++){//index is incremented 
        c[index++]=b[i];
    }
    //displaying merged elements using n+m 
    printf("the merged array elements are:");
    for(i=0;i<n+m;i++){
        printf("%d ",c[i]);
    }
}