//Read 2 matrices from the console and perform matrix addition.

import java.util.*;

public class Matrixaddition{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows and cols");
        int rows=sc.nextInt();
        int cols=sc.nextInt(); 

    //matrix1
        int[][] matrix1=new int[rows][cols];
        System.out.print("\n enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix1[i][j]=sc.nextInt();
            }
        }
    //matrix 2
        int[][] matrix2=new int[rows][cols];
        System.out.print("enter the elements:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix2[i][j]=sc.nextInt();
            }
        }

    //matrix3
        int[][] matrix3=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix3[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

    //printing the matrix
        System.out.println("the new matrix is:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix3[i][j]+" ");
            }
            System.out.println();
        }
    }   
}