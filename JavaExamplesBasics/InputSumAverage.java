/* 
 * Input Sum Average
 * 
 * Take double numbers as input and outputs their sum and their average value. 
 * Should be used with text file as input, as there is no exit 
 * condition for scanner.
 * 
 * 
 * Use: 
 * $ cat text.txt | java Test > output.txt
 * 
 * text.txt:
 * 1
 * 2
 * 3
 * 
 * Output: (in file output.txt)
 * Sum: 6.0000
 * Average: 2.0000
 */


import java.util.Scanner; // Import the Scanner class
import java.util.ArrayList; // Import the ArrayList class

class InputSumAverage {
    
    public static void main(String[] args) {
        ArrayList<Double> nums = new ArrayList<Double>(); // Create an ArrayList object
        Scanner scans = new Scanner(System.in); // Create a Scanner object

        while (scans.hasNextLine()) { // Scan until there are no more lines to scan
            double num = scans.nextDouble(); // Parse double from scanned string
            nums.add(num); // Add each scanned number to ArrayList
        }

        scans.close(); // Stop scanning

        double sum = 0; 

        for (int i = 0; i < nums.size(); i++) {
            sum += nums.get(i); // Calculate the sum
        }

        double average = sum / nums.size();
        System.out.printf("Sum: %.4f\n", sum); // Print the sum
        System.out.printf("Average: %.4f\n", average); // Print the sum
        
    }
}
