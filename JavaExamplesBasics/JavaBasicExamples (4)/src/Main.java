import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String options = "1-Addition\n" + "2-Subtraction\n" + "3-Multiplication\n" + "4-Division";
        System.out.println(options);

        System.out.print("Select the option: ");
        String option = scanner.nextLine();

        int number1, number2, result;

        switch (option){
            case "1":
                System.out.print("Enter first number: ");
                number1 = scanner.nextInt();

                System.out.print("Enter second number: ");
                number2 = scanner.nextInt();

                result = number1 + number2;

                System.out.print("Result: " + result);
                break;

            case "2":
                System.out.print("Enter first number:");
                number1 = scanner.nextInt();

                System.out.print("Enter second number:");
                number2 = scanner.nextInt();

                result = number1 - number2;

                System.out.print("Result: " + result);
                break;

            case "3":
                System.out.print("Enter first number:");
                number1 = scanner.nextInt();

                System.out.print("Enter second number:");
                number2 = scanner.nextInt();

                if(number2 == 0){
                    System.out.println("Division by zero error!");
                    System.exit(1);
                }
                else{
                    result = number1 / number2;

                    System.out.print("Result: " + result);
                }
                break;

            case "4":
                System.out.print("Enter first number:");
                number1 = scanner.nextInt();

                System.out.print("Enter second number:");
                number2 = scanner.nextInt();

                result = number1 * number2;

                System.out.print("Result: " + result);
                break;
            default:
                System.out.print("Invalid option!");
        }
    }
}

@themanoftalent
