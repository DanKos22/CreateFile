package ie.atu.week8;

import java.io.File;
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
        }
    }
}
