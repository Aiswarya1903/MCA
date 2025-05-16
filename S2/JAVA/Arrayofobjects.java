//Program to create a class for Employee having attributes eNo, eName eSalary. Read n employ 
//information and Search for an employee given eNo, using the concept of Array of Objects.

import java.util.*;
class Employee{
    Scanner sc=new Scanner(System.in);
    int empno;
    String ename;
    double esalary;
    Employee(int n){
        System.out.println("enter details of employee:");
        System.out.println("enter the employee num:");
        empno=sc.nextInt();
        System.out.println("enter the employee name:");
        ename=sc.next();
        System.out.println("enter the salary:");
        esalary=sc.nextDouble();
    }   

    
}

public class Arrayofobjects{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of employees:");
        int num=sc.nextInt();
        Employee[] employee=new Employee[num];
        for(int i=0;i<num;i++){
            employee[i]=new Employee(i+1);
        }

        System.out.print("enter the number of employee to search:");
        int n=sc.nextInt();
        int c=0;
        for(int i=0;i<num;i++){
            if(employee[i].empno==n){
                System.out.print("employee name:"+employee[i].ename+"\n salary:"+employee[i].esalary);
                c=1;
            }
        }
        if(c==0){
            System.out.println("employee not registered");
        }
    }
}