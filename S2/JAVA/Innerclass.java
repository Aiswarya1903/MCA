//Create CPU with attribute price. Create inner class Processor (no. of cores, manufacturer) 
//and static nested class RAM (memory, manufacturer). Create an object of CPU and print 
//information of Processor and RAM.

import  java.util.*;

class CPU{
    Scanner sc=new Scanner(System.in);
    int price;

    class Processor{
        int cores;
        String manufacturer;

        Processor(){
            System.out.print("enter processor cores:");
            cores=sc.nextInt();
            System.out.print("enter the manufacturer:");
            manufacturer=sc.next();
        }
    }

    static class RAM{
        Scanner sc=new Scanner(System.in);
        int memory;
        String manufacturer;

        RAM(){
            System.out.print("enter the memory:");
            memory=sc.nextInt();
            System.out.print("enter the manufacturer");
            manufacturer=sc.next();

        }
    }
}

class Innerclass{
    public static void main(String[] args){
        CPU c=new CPU();
        CPU.Processor p=c.new Processor();//non static
        CPU.RAM r=new CPU.RAM();

        c.price=2500+(p.cores*20)+(r.memory*15);
        System.out.println("\nProcessor Information:");
        System.out.println("Cores: " + p.cores);
        System.out.println("Manufacturer: " + p.manufacturer);

        System.out.println("\nRAM Information:");
        System.out.println("Memory: " + r.memory + "GB");
        System.out.println("Manufacturer: " + r.manufacturer);

        System.out.println("\nTotal CPU Price: $" + c.price);

    }
}
