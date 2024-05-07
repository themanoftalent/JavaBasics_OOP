//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;
public class CihanAssigment2 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("First Number: ");
        int firstNumber = Scanner.nextInt();
        System.out.print("Second Number: ");
        int secondNumber = Scanner.nextInt();
        double sum = 0;
        System.out.print("Choice: ");
        int chocice = Scanner.nextInt();
        switch (chocice) {
            case 1:
                sum = firstNumber + secondNumber;
                System.out.println("Sum: " + sum);
                break;
            case 2:
                sum = firstNumber - secondNumber;
                System.out.println("Sum: " + sum);
                break;
            case 3:
                sum = firstNumber * secondNumber;
                System.out.println("Sum: " + sum);
                break;
            case 4:
                if (secondNumber != 0) {
                    sum = (double) firstNumber / secondNumber;
                    System.out.println("Sum: " + sum);
                }else{
                    System.out.println("Error");
                }break;
            default:
                System.out.println("No choice");
                break;
        }
    }
}