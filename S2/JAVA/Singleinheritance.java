//Create a class ‘Employee’ with data members Empid, Name, Salary, Address and constructors to 
// initialize the data members. Create another class ‘Teacher’ that inherit the properties of class 
// employee and contain its own data members department, Subjects taught and constructors to 
// initialize these data members and also include display function to display all the data members. 
// Use array of objects to display details of N teachers. 

import java.util.*;
class Employee1{
    Scanner sc=new Scanner(System.in);
    int empid;
    String name;
    double salary;
    String address;
    public Employee1(int empid, String name, double salary, String address) {
        this.empid = empid;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

}

class Teacher extends Employee1{
    Scanner sc=new Scanner(System.in);
    String dept;
    String[] subject;
    int size;
    public Teacher(int empid, String name, double salary, String address, 
                  String dept, String[] subject) {
        super(empid, name, salary, address);
        this.dept= dept;
        this.subject= subject;

        
    }
    void display(int j){
        System.out.println("\nTeacher "+j+" Details"); 
        System.out.println("Employee Id: "+empid); 
        System.out.println("Employee Name: "+name); 
        System.out.println("Salary: "+salary); 
        System.out.println("Address: "+address); 
        System.out.println("Department: "+dept); 
        System.out.print("Subjects: "); 
        for(int i=0;i<size;i++) 
            System.out.print(subject[i]+" "); 
    }

}

public class Singleinheritance{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of teachers:");
        int n=sc.nextInt();
        Teacher[] t=new Teacher[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Teacher " + (i+1) + ":");
            
            System.out.print("Employee ID: ");
            int empid = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            System.out.print("Name: ");
            String name = sc.nextLine();
            
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); // Consume newline
            
            System.out.print("Address: ");
            String address = sc.nextLine();
            
            System.out.print("Department: ");
            String department = sc.nextLine();
            
            System.out.print("Number of subjects taught: ");
            int subjectCount = sc.nextInt();
            sc.nextLine(); // Consume newline
            
            String[] subjects = new String[subjectCount];
            System.out.println("Enter subjects (one per line):");
            for (int j = 0; j < subjectCount; j++) {
                subjects[j] = sc.nextLine();
            }
            
            t[i] = new Teacher(empid, name, salary, address, department, subjects);
        }
        
        System.out.println("\n===== Teacher Details =====");
        for (int i = 0; i < n; i++) {
            t[i].display(i+1);
        }
        
        sc.close();
    }
}