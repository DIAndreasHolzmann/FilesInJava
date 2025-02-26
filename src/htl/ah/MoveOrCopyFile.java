package htl.ah;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveOrCopyFile {
	

	 public static void main(String[] args)
	 {
        String sourcePath = "C:/tmp/tmp.txt";
	    String targetPath = "D:/temp/tmp2.txt";

	    try {
	        Files.move(
	        		Paths.get(sourcePath), 
	        		Paths.get(targetPath), 
	        		StandardCopyOption.COPY_ATTRIBUTES, 
	        		StandardCopyOption.REPLACE_EXISTING);

	        Files.copy(Paths.get(sourcePath), 
	        		Paths.get(targetPath), 
	        		StandardCopyOption.COPY_ATTRIBUTES, 
	        		StandardCopyOption.REPLACE_EXISTING);
	        
	    } catch (Exception e) {

	       
	        e.printStackTrace();
	    }

	    
	}
	
	
}
