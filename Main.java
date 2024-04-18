//Segbe Abdoul Aziz Diomande
import java.util.Scanner;
public class Assigment2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number :");
            int number1 = scanner.nextInt();
            System.out.println("Enter an operator (+, -, *, /) :");
            char operator = scanner.next().charAt(0);
            System.out.println("Enter the second number :");
            int number2 = scanner.nextInt();
            int result = 0;
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println("The result of the addition is : " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("The result of the soustration is  : " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("The result of the multiplication is  : " + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                        System.out.println("The result of the division is  : " + result);
                    } else {
                        System.out.println("erreur");
                    }
                    break;
                default:
                    System.out.println("Opérateur non valide ");
            }
        }


}




    }
}
