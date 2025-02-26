package htl.ah;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class FileTraversal {

	public static void main(String[] args) {

		// Specify the directory path
		String directoryPath = "/Users/omozegieaziegbe/development/javacodegeeks/";

		// Using File class (pre-Java 7)
		File directory = new File(directoryPath);
		traverseFiles(directory);
	}

	// Recursive function to traverse subdirectories
	public static void traverseFiles(File folder) {
		if (folder.isDirectory()) {
			File[] files = folder.listFiles();
			if (files != null) {
				for (File file : files) {
					if (file.isDirectory()) {
						traverseFiles(file); // Recursive call for subdirectories
					} else {
						System.out.println("File: " + file.getAbsolutePath());
					}
				}
			}
		}
	}

	public static void traverseFilesJava8() {
		Path folderPath = Paths.get("C:/tmp");
		// Adjust this path to match your folder structure
		try {
			Stream<Path> paths = Files.walk(folderPath);
			List<Path> list = paths.toList();
			for (Path path : list) {
				System.out.println(path.toString());
			}
			paths.close();
			
		} catch (IOException e) {
				e.printStackTrace();
		}
	}
}