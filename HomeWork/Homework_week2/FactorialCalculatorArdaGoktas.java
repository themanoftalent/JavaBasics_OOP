// Arda Göktaş 2311502241
import java.util.*;
public class FactorialCalculatorArdaGoktas {
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        int factorial,result=1;
        System.out.println("Enter a number you want to use for factorial operation: ");
        factorial = input.nextInt();
        for(int i=1; i<=factorial; i++){
            result *= i;
        }
        System.out.println("The result is : " + result);
    }
}
