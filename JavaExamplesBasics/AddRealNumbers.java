import java.util.Scanner; // Import the Scanner class

class AddRealNumbers {
    public static void main(String[] args) {
        double x, y, sum;
        Scanner scans = new Scanner(System.in); // Create a Scanner object
        System.out.println("Type a number:");
        x = scans.nextDouble(); // Read user input

        System.out.println("Type another number:");
        y = scans.nextDouble(); // Read user input

        scans.close();

        sum = x + y; // Calculate the sum of x + y
        System.out.println("Sum is: " + sum); // Print the sum
    }
}
