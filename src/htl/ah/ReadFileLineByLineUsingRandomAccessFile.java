package htl.ah;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReadFileLineByLineUsingRandomAccessFile {

 public static void main(String[] args) {
  try {
   RandomAccessFile file = new RandomAccessFile("sample.txt", "r");
   String str;

   // Position ändern: file.seek(100);
   // Position auslesen: long position = file.getFilePointer();
   // Dateigröße: long length = file.length();
   // Datei schließen: file.close();
  
   while ((str = file.readLine()) != null) {
    System.out.println(str);
    
   }

   file.close();
  } catch (IOException e) {
   e.printStackTrace();
  }
 }

}