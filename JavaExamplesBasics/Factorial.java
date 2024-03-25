/* Factorial with recursion */

import java.util.Scanner;

class Factorial {

    static long factorial(int n) {
        if (n == 1) return 1;
        if ( n > 1) {
            return n * factorial(n - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
	System.out.println("Enter number to calculate its factorial: ");

        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        input.close();

        long result = factorial(x);
        System.out.println("The factorial of " + x + " is " + result);
    }
}
