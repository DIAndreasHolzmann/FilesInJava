package htl.ah;
//Writing Files using Java Program

import java.io.BufferedWriter;
import java.io.File;
//Import the FileWriter class
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption; 

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
	        writer.flush();
	        writer.close(); 
	    }   // Exception Thrown
	    catch (IOException e) {
	        System.out.println("An error has occurred.");
	        e.printStackTrace();
	    }
     
	    // #####################################################################
     
	    File file = new File("Ausgabe.txt"); //Datei, in die geschrieben werden soll
	    try {
	    	BufferedWriter writer = new BufferedWriter(
    			   new FileWriter(file)); 
	    	//Erzeugen eines effizienten Writers für Textdateien
	    	writer.write("Text");
	    	writer.newLine();
	    	writer.flush();
	    	writer.close();
	    }
	    catch(IOException ioe) {
	    	System.err.println(ioe);
	    }
 

     	// #####################################################################
     
     	//Text wird ans Dateiende angehaengen
		try (FileWriter fwriter = new FileWriter(new File("Logfile.txt"), true)) {
			BufferedWriter writer = new BufferedWriter(fwriter); 
			writer.write("Text");
			writer.newLine();
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
 

	    // #####################################################################
		
	    String s = "/Users/jo/Desktop/test.txt";
	    PrintWriter pWriter = null;
        try {
            pWriter = new PrintWriter(new FileWriter(s));
            pWriter.println("Hallo Welt!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            if (pWriter != null) {
                pWriter.flush();
                pWriter.close();
            }
        }
        
        
        // Seit Java 7
     // #####################################################################
		
        try (PrintWriter pWriter1 = new PrintWriter(new FileWriter(s))) {
            pWriter1.println("Hallo Welt!");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
        
        
        // Seit Java 11
     // #####################################################################
		
        Path p = Path.of("/Users/jo/Desktop/test.txt");
        try {
            Path filePath = Files.writeString(
            		p, "Hallo Welt!", 
            		Charset.forName("UTF-8"), 
            		StandardOpenOption.APPEND);
            
            
            String str = Files.readString(filePath, Charset.forName("UTF-8"));
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
 }
 
 
 
}