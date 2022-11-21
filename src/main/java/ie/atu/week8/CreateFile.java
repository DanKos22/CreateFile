package ie.atu.week8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CreateFile {
    public static void main(String[] args) {

        {
            File myFile = new File ("MyFile.txt");
            System.out.println("My file is located at: " + myFile.getAbsolutePath());
            try
            {
                FileWriter fw = new FileWriter("MyFile.txt",true);
                PrintWriter pw = new PrintWriter(fw);
                pw.println("Seventh Line: ");
                pw.close();
            }
            catch(IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
