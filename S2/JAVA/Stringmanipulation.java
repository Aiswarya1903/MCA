//Java program to demonstrate string manipulation functions.

import java.util.*;
class Word{
    Scanner sc=new Scanner(System.in);
    String s;
    public void inputString(){
        System.out.print("enter a String:");
        s=sc.nextLine();
    }

    public void String_functions(){
        System.out.print("lower case:"+s.toLowerCase());
        System.out.print("\nuppercase:"+s.toUpperCase());
        System.out.print("\nLength:"+s.length());
        System.out.print("\nSubstring(2):"+s.substring(2));
        System.out.print("\nSubstring(2,6):"+s.substring(2,6));
        System.out.print("\ntrim: "+s.trim());
        System.out.print("\nindexOf('o'):"+s.indexOf('o'));
        System.out.print("\nindexOf('o',10):"+s.indexOf('o',10));
        System.out.print("\nconcat('CR7'):"+s.concat("CR7"));
    }
}

public class Stringmanipulation{
    public static void main(String[] args){
        Word w=new Word();
        w.inputString();
        w.String_functions();
    }
}