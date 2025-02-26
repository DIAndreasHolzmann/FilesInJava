package htl.ah;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;

public class ReadUTF8File {
    public static void main(String[] args) {
        try {
            // This line reads the content of the file "example.txt" assuming it's encoded in UTF-8.
            // The Path.of("example.txt") method creates a Path object representing the file path.
            // The StandardCharsets.UTF_8 parameter specifies the character set to use for decoding.
            String content = Files.readString(
            		Path.of("example.txt"), 
            		StandardCharsets.UTF_8);
            // This line prints the content of the file to the console.
            System.out.println(content);
        } catch (IOException e) {
            // This block catches any IOException that might occur during file reading and prints the stack trace.
            e.printStackTrace();
        }
    }
    /*
      public static void main(String[] args) {
        try {
            // This line reads the content of the file "example.txt" assuming it's encoded in UTF-16.
            // The Path.of("example.txt") method creates a Path object representing the file path.
            // The Charset.forName("UTF-16") parameter specifies the character set to use for decoding.
            String content = Files.readString(Path.of("example.txt"), Charset.forName("UTF-16"));
            // This line prints the content of the file to the console.
            System.out.println(content);
        } catch (IOException e) {
            // This block catches any IOException that might occur during file reading and prints the stack trace.
            e.printStackTrace();
        }
    }
     */
}
