import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestFile {
     public static void main(String[] args)  {

     String amarFileNameAndLocation  = "d:\\a.txt"; // In linux, you should use /user/bin/a.txt
     File amarFile = new File ( amarFileNameAndLocation );
     try {
            Scanner  sc = new Scanner(amarFile);
            //   Scanner  s = new Scanner (new File("c:\\a.txt") );

             while (sc.hasNextLine()) {
                int i = sc.nextInt();
                System.out.println(i);
                //ektaLine = s.nextLine();
                // x = Integer.parseInt(ektaLine);
             }
            sc.close();

        } catch (FileNotFoundException ex) {
           System.out.println("Error: "+ex);
        }
        
         // file write method
        try {
            File file = new File("D:/file.txt");
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("hello");
            printWriter.close();
        } catch (Exception ex) {
            System.out.println("Error: " + ex);
        }
        
     
        }

}
