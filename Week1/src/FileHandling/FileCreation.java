package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileCreation {
    public static void main(String[] args) {
        //Code to create a new file
        /*
        File myfile = new File("karan.txt");
        try {
            myfile.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            e.printStackTrace();
        }


        //code to write in a file
        try {
            FileWriter fileWriter = new FileWriter("karan.txt");
            fileWriter.write("This is a file which I created, alright gotta go!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
         */

        //Reading a file
        File myfile = new File("karan.txt");
        try {
            Scanner scanner = new Scanner(myfile);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
