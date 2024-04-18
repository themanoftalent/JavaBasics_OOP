import java.util.*;

public class talhaAssignment9 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int number;
        System.out.println("Enter your number :");
        number = input.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a composite number.");
        }
    }
}
