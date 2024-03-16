import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner input = new Scanner(System.in);

        System.out.println("1.Addition \n" +
                "2.Subtraction \n" +
                "3.Division \n" +
                "4.Multiplication \n" +
                "5.Exit");

        System.out.print("Select the option: ");
        int option = input.nextInt();

        float number1, number2, result;

    switch (option) {
        case 1:
            System.out.print("Enter first number: ");
            number1 = input.nextFloat();

            System.out.print("Enter first number: ");
            number2 = input.nextFloat();

            result = number1 + number2;

            System.out.println("Result: " + result);

            break;

        case 2:
            System.out.print("Enter first number: ");
            number1 = input.nextFloat();

            System.out.print("Enter first number: ");
            number2 = input.nextFloat();

            result = number1 - number2;

            System.out.println("Result: " + result);

            break;

        case 3:
            System.out.print("Enter first number: ");
            number1 = input.nextFloat();

            System.out.print("Enter first number: ");
            number2 = input.nextFloat();

            if (number2 == 0) {
                System.out.println("Division by zero error!");
            } 
            
            else {
                result = number1 / number2;

                System.out.println("Result: " + result);

            }
            break;

        case 4:
            System.out.print("Enter first number: ");
            number1 = input.nextFloat();

            System.out.print("Enter first number: ");
            number2 = input.nextFloat();

            result = number1 * number2;

            System.out.println("Result: " + result);

        break;

        case 5:
            System.out.println("Exiting...");
        break;
        default:
            System.out.println("Error! Invalid option!");
    }
    input.close();
    }
}
