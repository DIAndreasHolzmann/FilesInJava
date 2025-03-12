package htl.ah;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class ReadFileLineByLine {
 
	public static void main(String[] args) {
		
		try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
		    String line;
		    while ((line = reader.readLine()) != null) {
		        System.out.println(line);
		    }
		    
		    // Oder:
		    line = reader.readLine();
		    while (line != null) {
		    	System.out.println(line);
		    	// read next line
		    	line = reader.readLine();
		    }
		    
		    // Bei Verwendung von streams:
		    // :: bedeutet Methodenreferenz
		    // beim Stream-Objekt reader wird die Methode lines() aufgerufen
		    // forEach() wird aufgerufen, um die Zeilen abzuarbeiten
		    // für jede Zeile wird die Methode println() mit der Zeile aufgerufen
		    reader.lines().forEach(System.out::println);
		    // oder
		    reader.lines().forEach(actLine -> System.out.println(actLine));
		    
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
        
        // Oder mit Files.readAllLines()
		try {
			 List<String> allLines = Files.readAllLines(Paths.get("sample.txt"));
			 for (String line : allLines) {
				 	System.out.println(line);
			 }
		} catch (IOException e) {
			 e.printStackTrace();
		}
		
		 // Reading File also
	     // Handling Exception
	     try {
	         File obj = new File("myfile.txt");
	         Scanner reader = new Scanner(obj);
	       
	         // Traversing File Data
	           while (reader.hasNextLine()) {
	             String data = reader.nextLine();
	             System.out.println(data);
	         }
	         reader.close();
	     }
	     // Exception Cases
	     catch (FileNotFoundException e) {
	         System.out.println("An error has occurred.");
	         e.printStackTrace();
	     }
	     
	     
		 try (RandomAccessFile file = new RandomAccessFile("sample.txt", "r"))
		 {	  
			 String str;

			 // Position ändern: file.seek(100);
			 // Position auslesen: long position = file.getFilePointer();
			 // Dateigröße: long length = file.length();
			 // Datei schließen: file.close();
			  
			 while ((str = file.readLine()) != null) {
				  System.out.println(str);
			 }
		 } catch (IOException e) {
			 e.printStackTrace();
		 }
		 
		 
		 
		 try (BufferedReader reader = Files.newBufferedReader(Path.of("largefile.txt"))) {
	         reader.lines().forEach(line -> {
	            	 System.out.println(line);
               });     
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
    }
}
