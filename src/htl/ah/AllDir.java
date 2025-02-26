package htl.ah;
import java.io.BufferedReader;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Date;

// Displaying the contents of a directory
class AllDir 
{
    public static void main(String[] args)
        throws IOException
    {
        // Enter the path and dirname
        BufferedReader br = new BufferedReader(
            new InputStreamReader(System.in));

        System.out.print("Enter directory path : ");
        String dirpath = br.readLine();
      
        System.out.print("Enter the directory name : ");
        String dname = br.readLine();

        // Create File object with dirpath and dname
        File f = new File(dirpath, dname);

        // If directory exists,then
        if (f.exists()) {
            
              // Get the contents into arr[]
            // now arr[i] represent either a File or
            // Directory
            String arr[] = f.list();

            // Find no. of entries in the directory
            int n = arr.length;

            
            // Displaying the entries
            for (int i = 0; i < n; i++) {

                System.out.print(arr[i] + " ");

                // Create File object with the entry and
                // test if it is a file or directory
                File f1 = new File(f,arr[i]);
              
                if (f1.isFile())
                    System.out.println(": is a file");
                if (f1.isDirectory())
                    System.out.println(": is a directory");
                // modification date
                long millisecs =  f1.lastModified();
                Date date = new Date(millisecs);
                System.out.println("Last modified on : " + date);
                
            }

            System.out.println("\nNo of entries in this directory : " + n);
        }
        else
            System.out.println("Directory not found");
        

        // Filtering the files with .txt extension
        // ==========================================
        // create an instance of FilenameFilter and override the accept method
        FilenameFilter filter = new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.endsWith(".txt");
            }
        };
        String arr[] = f.list(filter);
		for (String fname : arr) {
			System.out.println(fname);
		}
    }
}