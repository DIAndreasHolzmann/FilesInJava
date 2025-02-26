package htl.ah;
//Writing Files using Java Program

//Import the FileWriter class
import java.io.FileWriter;
import java.io.IOException; 

public class WriteFile 
{
 public static void main(String[] args)
 {
     // Writing Text File also
     // Exception Handling
     try {

         FileWriter writer = new FileWriter("myfile.txt");

         // Writing File
        
         writer.write("Txt File Created Successfully.");
         writer.close();
         
         System.out.println("Successfully written.");
     }

     // Exception Thrown
     catch (IOException e) {
         System.out.println("An error has occurred.");
         e.printStackTrace();
     }
 }
}