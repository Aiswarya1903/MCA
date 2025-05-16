// Program to search for an element in an array. 

import java.util.*;

class array{
    Scanner sc=new Scanner(System.in);
    int[] arr;
    int size;
    array(int n){
        this.size=n;
        this.arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
    }

    void search(int n){
        int c=0;
        int in=0;
        for(int i=0;i<size;i++){
            if(arr[i]==n){
                c=1;
                in=i;
                break;
            }
        }
        if(c==1){
            System.out.print("element found at index:"+in);
        }
        else{
            System.out.print("element not found");
        }

    }

}

class Searcharray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of elements in the array:");
        int size=sc.nextInt();
        array a=new array(size);

        System.out.print("enter the elemnt to be searched:");
        int ele=sc.nextInt();
        a.search(ele);
    }
}