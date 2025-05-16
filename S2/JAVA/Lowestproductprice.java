// Define a class ‘product’ with data members pcode, pname and price. Create 3 objects of the 
//class and find the product having the lowest price. 

import java.util.*;

class Product{
    String pcode;
    String pname;
    int price;

    public Product(String pcode,String pname,int price){
        this.pcode=pcode;
        this.pname=pname;
        this.price=price;
    }

    public void display(){
        System.out.println("code "+pcode);
        System.out.println("name "+pname);
        System.out.println("price "+price);
    }
}

class Compare{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Product[] p=new Product[3];
        for(int i=0;i<3;i++){
            System.out.print("enter the product code:");
            String code=sc.next();
            System.out.print("enter the product name:");
            String name=sc.next();
            System.out.print("enter the price:");
            int price=sc.nextInt();

            p[i]=new Product(code,name,price);
        }
        System.out.println("all products");
        for(int i=0;i<3;i++){
            p[i].display();
        }

        //compare
        Product lowest=p[0];
        for(int i=0;i<3;i++){
            if(p[i].price<lowest.price){
                lowest=p[i];
            }
        }

        //printing the lowest
        System.out.print("the lowest product is");
        lowest.display();

        sc.close();
    }
}