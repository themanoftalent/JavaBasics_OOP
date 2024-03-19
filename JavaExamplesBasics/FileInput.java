/*
 * File Input
 * 
 * Take text file filename as argument and calculate the sum of the numbers.
 * Each number should be on a seperate line. 
 * 
 * Use: 
 * $java FileInput numbers.txt
 * 
 * numbers.txt:
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 
 * Output:
 * Sum: 21.00
 */

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class FileInput {
    public static void main(String[] args) {
        try {
            double sum = 0;
            File file;

            if (0 < args.length) {
                String filename = args[0];
                file = new File(filename);
            } else {
                System.out.println("Please enter filename");
                return;
            }

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                double data = Double.parseDouble(myReader.nextLine());
                sum += data;
            }
            myReader.close();
            System.out.printf("Sum: %.2f\n", sum);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
