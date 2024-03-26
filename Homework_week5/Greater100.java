import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.print("Enter a start number: ");
            number = input.nextInt();

            if (number < 100) {
                System.out.println("Please enter a number 100 or greater than 100:");
            }
        }
        while (number < 100);

        for (int i = number; i >= 0; i--) {
            System.out.println(i);


        }
    }
}
