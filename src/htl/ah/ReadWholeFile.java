package htl.ah;
//Reading File using Java Program
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner; 

public class ReadWholeFile 
{
	public static void main(String[] args)
	{

	    // ========================
	    // Read file at once:
	    // ========================
	    Scanner scanner2 = new Scanner(new InputStreamReader(
	    		    ClassLoader.getSystemResourceAsStream("myfile.txt")));
	
		scanner2.useDelimiter("\\Z");
		String content = scanner2.next();
		System.out.println(content);
		scanner2.close();
		
		
		
	    try {
            // This line reads the content of the file "example.txt" 
        	// assuming it's encoded in UTF-8.
            // The Path.of("example.txt") method creates a Path object 
        	// representing the file path.
            // The StandardCharsets.UTF_8 parameter specifies the character set 
        	// to use for decoding.
            content = Files.readString(
            		Path.of("example.txt"), 
            		StandardCharsets.UTF_8);
            
            //  Charset.forName("UTF-16") can be used to read files encoded in UTF-16.
            //  Charset.forName("ISO-8859-1") can be used to read files encoded in ISO-8859-1.
            // ...
            
            // This line prints the content of the file to the console.
            System.out.println(content);
        } catch (IOException e) {
            // This block catches any IOException that might occur during file reading and prints the stack trace.
                e.printStackTrace();
        }
	}
}