// Arda Göktaş 2311502241
import java.util.*;
public class SumOfDigitsArdaGoktas {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num, originalNum, sum=0;
        System.out.println("Please input a number");
        num = input.nextInt();
        originalNum = num;
        while(num>0){
            sum += num % 10;
            num /= 10;
        }
    System.out.println("Sum of the digits in "+ originalNum + " are " + sum);
    }
}