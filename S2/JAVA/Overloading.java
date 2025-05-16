// Program to calculate area of different shapes using overloaded functions.
import java.util.*;
class Shape_area{
    void area(double r){
        System.out.print("area of circle: "+String.format("%.2f",3.14*r*r));
    }
    void area(int r){
        System.out.println("area of square:"+(r*r));
    }
    void area(double l,double b){
        System.out.println("Area of rectangle is :"+(l*b));

    }
    void area(float b,float h){
        System.out.println("Area of triangle is:"+(0.5*b*h));
    }
}
public class Overloading{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Shape_area s=new Shape_area();
        System.out.print("enter the radius of the circle:");
        s.area(sc.nextDouble());

        System.out.println("enter the length of the square:");
        s.area(sc.nextInt());

        System.out.println("enter the length and breadth of rectangle:");
        double  a=sc.nextDouble();
        double b=sc.nextDouble();
        s.area(a,b);

        System.out.println("enter the base and height of the triangle:");
        float k=sc.nextFloat();
        float h=sc.nextFloat();
        s.area(k,h);
    }
}