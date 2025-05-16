
// initialize the data members and another class ‘Employee’ that inherits the properties  of class 
// Person and also contains its own data members like Empid, Company_name, Qualification, 
// Salary and its own constructor. Create another class ‘Teacher’ that inherits the properties of class 
// Employee and contains its own data members like Subject, Department, Teacherid and also 
// contain constructors and methods to display the data members. Use array of objects to display 
// details of N teachers. 

import java.util.*;
class Person{
    String name;
    String gender;
    String address;
    int age;
    Person(String name,String gender,String address,int age){
        this.name=name;
        this.gender=gender;
        this.address=address;
        this.age=age;
    }
}

class Employe extends Person{
    int empid;
    String company;
    String qualification;
    double salary;
    Employe(String name,String gender,String address,int age,int empid,String company,String qualification,double salary){
        super(name,gender,address,age);
        this.empid=empid;
        this.company=company;
        this.qualification=qualification;
        this.salary=salary;
    }
}

class Teacher extends Employe{
    String subject;
    String dept;
    int teacherid;
    Teacher(String name,String gender,String address,int age,int empid,String company,String qualification,double salary,String subject,String dept,int teacherid){
        super(name,gender,address,age,empid,company,qualification,salary);
        this.subject=subject;
        this.dept=dept;
        this.teacherid=teacherid;
    }

    public void display(int j){
        System.out.println("details of teacher "+j);
        System.out.print("Name is:"+name);
        System.out.println("gender is: "+gender);
        System.out.println("address:"+address);
        System.out.println("age:"+age);
        System.out.println("empid:"+empid);
        System.out.println("company:"+company);
        System.out.println("qualification:"+qualification);
        System.out.println("salary:"+salary);
        System.out.println("Subject: " + subject);
        System.out.println("Department: " + dept);
        System.out.println("Teacher ID: " + teacherid);
    }
}

public class Multilevelinheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("enter the number of teachers:");
        int n=sc.nextInt();

        Teacher[] t=new Teacher[n];
        for(int i=0;i<n;i++){
            System.out.print("enter details of teacher "+(i+1));

            System.out.print("Name: ");
            String name = sc.nextLine();
            sc.nextLine();
            
            System.out.print("Gender: ");
            String gender = sc.nextLine();
            
            System.out.print("Address: ");
            String address = sc.nextLine();
            
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine();
            
            System.out.print("compnay");
            String company=sc.next();
            
             System.out.print("Qualification: ");
            String qualification = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine();
            
            System.out.print("Subject: ");
            String subject = sc.nextLine();
            
            System.out.print("Department: ");
            String dept = sc.nextLine();
            
            System.out.print("Teacher ID: ");
            int teacherid= sc.nextInt();
            sc.nextLine();

            t[i]=new Teacher(name,gender,address,age,empid,company,qualification,salary,subject,dept,teacherid);
        }
        for(int i=0;i<n;i++){

            t[i].display(i+1);
        }
    }
}