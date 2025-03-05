package htl.ah;
//Deleting File using Java Program
import java.io.File; 

public class DeleteFile 
{
 public static void main(String[] args)
 {
     File obj = new File("myfile.txt");
     File newObj = new File("newfile.txt");
     
     obj.renameTo(newObj);
     
     // Deleting File
     if (newObj.delete()) {
         System.out.println("The deleted file is : " + obj.getName());
     }
     else {
         System.out.println(
             "Failed in deleting the file.");
     }
 }
}
