// Arda Göktaş 2311502241
import java.util.*;
public class EvenorOddArdaGoktas {
    static Scanner input =new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        System.out.println("Please enter an integer number: ");
        num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("The number is even");
        }
        else{
            System.out.println("The number is odd");
        }
    }
}
