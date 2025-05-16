import java.util.*;

class Matrixadd{
    int rows;
    int cols;
    int[][] matrix;

    public Matrixadd(int rows,int cols){
        this.rows=rows;
        this.cols=cols;
        this.matrix=new int[rows][cols];
    }

    public void insertelements(Scanner sc,String name){
        System.out.print("enter the elements for"+name );
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }

    public Matrixadd add(Matrixadd other){
        Matrixadd result=new Matrixadd(rows,cols);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                result.matrix[i][j]=this.matrix[i][j]+other.matrix[i][j];
            }
        }
        return result;
    }

    public void display(){
        System.out.print("the elements are:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(this.matrix[i][j]+" ");
            }
        }
        System.out.println();
    }

}

public class Matrixaddition2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number of rows and cols:");
        int rows=sc.nextInt();
        int cols=sc.nextInt();

        Matrixadd m1=new Matrixadd(rows,cols);
        Matrixadd m2=new Matrixadd(rows,cols);

        m1.insertelements(sc,"matrix1");
        m2.insertelements(sc,"matrix2");

        Matrixadd result=m1.add(m2);
        result.display();
    }

}