//Program to list the sub directories and files in a given directory and also search for a file name

import java.io.File;
import java.util.*;

public class Directorylisting{
    Static void listfiledirectories(File directory){
        File[] fileList=directory.listFiles();
        if(fileList!=null){
            for(File file:fileList){
                System.out.print(file.getName());
                if(file.isDirectory()){
                    listfiledirectories(file);
                }
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the directory path:");
        String directoryPath=sc.nextLine();
        File directory=new File(directoryPath);
        if(directory.exists() && directory.isDirectory()){
            System.out.println("files and direc in specifies  direc:");
            listfiledirectories(directory);
            System.out.println("enter the fil to search");
            String filename=sc.nectLine();
            System.out.println(s)
            searchfile(directory,filename);
        }
    }
}
