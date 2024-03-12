import java.util.Scanner;
public class basicCalculator {
    public static void main(String[] args) {
//                      Basic Calculator
        double firstNumber, secondNumber, resultNumber = 0;
//        If Second number is 0 and operation is / we cant calculate so puller is here for if this combination happens pul the user back
        Boolean puller = false;
        char userOp;
        Scanner userInput = new Scanner(System.in);
        do {
        puller = false;
        System.out.print("Welcome to the Basic Calculator\nEnter first number of your calculation");
        firstNumber = userInput.nextDouble();
        System.out.println("Enter Second number of your calculation");
        secondNumber = userInput.nextDouble();
        System.out.println("Enter your operation(+,-,*,/)");
//        if we make userOp string we can get operation input with userInput.nextline()
//        But Strings are takes more place on memory than chars so my opinion is using char is more efficient
        userOp = userInput.next().charAt(0);

        if (secondNumber == 0) {
            switch (userOp) {
                case '+':
                    resultNumber = firstNumber + secondNumber
                    ;
                    break;
                case '-':
                    resultNumber = firstNumber - secondNumber;
                    break;
                case '*':
                    resultNumber = firstNumber * secondNumber;
                    break;
                case '/':
                    System.out.println("Second number cannot be 0(ZERO)");
                    puller = true;
                    break;
                default:
                    System.out.println("Valid operations are '+','-','*','/'");
                    puller = true;
            }
        } else {
            switch (userOp) {
                case '+':
                    resultNumber = firstNumber + secondNumber
                    ;
                    break;
                case '-':
                    resultNumber = firstNumber - secondNumber;
                    break;
                case '*':
                    resultNumber = firstNumber * secondNumber;
                    break;
                case '/':
                    resultNumber = firstNumber / secondNumber;
                    break;
                default:
                    System.out.println("Valid operations are '+','-','*','/'");
                    puller = true;
            }

        }

    }while (puller);
        userInput.close();
    System.out.println(resultNumber);

    }
}
@themanoftalent
