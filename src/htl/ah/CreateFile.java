package htl.ah;
//Creating File using Java Program

//Import the File class
import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateFile
{
 public static void main(String[] args)
 {
       // Creating the File also
       // Handling Exception
     try {
         File obj = new File("C:/tmp/myfile.txt");
         
           // Creating File
           if (obj.createNewFile()) {
             System.out.println("File created: " + obj.getName());
         }
         else {
             System.out.println("File already exists.");
         }
           
     
         File obj2 = new File("C:/tmp/newdir");
        
         
         if (obj2.mkdir()) {
             System.out.println("Directory created: " + obj2.getName());
         }
         else {
             System.out.println("Directory already exists");
         }
     }
   
       // Exception Thrown
     catch (IOException e) {
         System.out.println("An error has occurred.");
         e.printStackTrace();
     }
 }
}