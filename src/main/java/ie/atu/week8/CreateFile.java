package ie.atu.week8;

import java.io.File;
 Add_data
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

 Main

public class CreateFile {
    public static void main(String[] args) {
        {
Add_data
            File myFile = new File ("MyFile.txt");
            System.out.println("My file is located at: " + myFile.getAbsolutePath());
            try
            {
                FileWriter fw = new FileWriter("MyFile.txt",true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println("Fifth Line: ");
                pw.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }

            File myFile = new File("MyFile.txt");
            System.out.println("My file is located at " + myFile.getAbsolutePath());
 Main
        }
    }
}
