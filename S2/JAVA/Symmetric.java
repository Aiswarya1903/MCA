//Read a matrix from the console and check whether it is symmetric or not.

import java.util.*;

class Symmetric{
    int rows;
    int cols;
    int[][] matrix;

    Scanner sc=new Scanner(System.in);
    //constructor
    Symmetric(){
        System.out.print("enter the number of rows:");
        rows=sc.nextInt();
        System.out.print("enter the number of cols:");
        cols=sc.nextInt();
        matrix=new int[rows][cols];
        System.out.print("enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    //method
    int c=1;
    void transpose(){
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[j][i]!=matrix[i][j]){
                    c=0;
                    break;
                }
            }
        }
        if(c==1){
            System.out.print("matrix is Symmetric");
        }
        else{
            System.out.print("matrix is not Symmetric");
        }
    }
}

class Sym{
    public static void main(String[] args){
        Symmetric m1=new Symmetric();
        m1.transpose();
    }
}