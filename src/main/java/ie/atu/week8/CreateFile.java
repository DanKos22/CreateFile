package ie.atu.week8;

import java.io.File;
 Read_file
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CreateFile {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the filename: ");
        String filename = keyboard.nextLine();

        // Open the file
        try(Scanner inputFile = new Scanner(new File(filename)))
        {
            // Read until the end of the file
            while(inputFile.hasNext())
            {
                // Reading a line from the file
                String str = inputFile.nextLine();
                System.out.println(str);
            }
            // Close the file when done
            inputFile.close();
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();

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
 Main
        }
    }
}
