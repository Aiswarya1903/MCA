//Read 2 complex numbers and perform addition on the 2 complex numbers. 

import java.util.*;
class Complex{
    double real;
    double imaginary;
    
    Scanner sc=new Scanner(System.in);
    void input(int x){
        System.out.print("enter real part:");
        real=sc.nextDouble();
        System.out.print("enter imaginary part");
        imaginary=sc.nextDouble();
    }

    void add(Complex other){
        Complex c=new Complex();
        c.real=this.real+other.real;
        c.imaginary=this.imaginary+other.imaginary;
        System.out.print("the result is :"+c.real+"+"+c.imaginary+"i");
    }
}

public class Complexnumber{
    public static void main(String[] args) {
        Complex a=new Complex();
        Complex b=new Complex();
        a.input(1);
        b.input(2);
        a.add(b);
    }
}
