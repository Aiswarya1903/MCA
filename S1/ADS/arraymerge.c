#include<stdio.h>
#include<stdlib.h>

void main(){
    int n,m;
    printf("enter the size of the first array:");
    scanf("%d",&n);
    printf("enter the elements of the second array:");
    scanf("%d",&m);
    
    int a[n],b[m],c[n+m];
    printf("enter the elements of first array:\n");
    for(int i=0;i<n;i++){
        printf("a[%d]=",i);
        scanf("%d",&a[i]);
    }
    printf("enter the elements of second array:\n");
    for(int i=0;i<m;i++){
        printf("b[%d]=",i);
        scanf("%d",&b[i]);
    }
    //merged array
    int j=0;
    for(int i=0;i<n;i++){
        c[j++]=a[i];
    }
    for(int i=0;i<m;i++){//index is incremented 
        c[j++]=b[i];
    }
    //displaying merged elements using n+m 
    printf("the merged array elements are:");
    for(int i=0;i<n+m;i++){
        printf("C[%d]=%d",i,c[i]);
    }
}
