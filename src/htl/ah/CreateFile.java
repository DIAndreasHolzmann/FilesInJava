package htl.ah;
//Creating File using Java Program

//Import the File class
import java.io.File;
import java.io.IOException;

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
     }
   
       // Exception Thrown
     catch (IOException e) {
         System.out.println("An error has occurred.");
         e.printStackTrace();
     }
 }
}