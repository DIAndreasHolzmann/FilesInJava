package htl.ah;

import java.io.*;
import java.nio.file.*;

public class ReadFilesBufferReadersWithStreams {

    public static void main(String[] args) {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("largefile.txt"))) {
            reader.lines().forEach(line -> System.out.println(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
