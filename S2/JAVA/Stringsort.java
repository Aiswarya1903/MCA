//Write a Java program to sort strings.

import java.util.*;
class sort_strings{
    Scanner sc=new Scanner(System.in);
    String[] s;
    int size;
    void sort_strings(){
        System.out.println("enter the number of stringss:");
        size=sc.nextInt();
        s=new String[size];
        System.out.print("enter "+size+" Strings:");
        for(int i=0;i<size;i++){
            s[i]=sc.next();
        }
    }
    void sort(){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(s[j].compareTo(s[j+1])>0){
                    String temp=s[j];
                    s[j]=s[j+1];
                    s[j+1]=temp;
                }
            }
        }
    }

    void display(){
        for(int i=0;i<size;i++){
            System.out.print(s[i]+" ");
        }
    }


}

public class Stringsort{
    public static void main(String[] args) {
        sort_strings s1=new sort_strings();
        s1.sort_strings();
        s1.sort();
        System.out.print("sorted string array is:");
        s1.display();
    
    }

}