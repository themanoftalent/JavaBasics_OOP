// Arda Göktaş 2311502241
import java.util.*;
public class FibonacciSequenceArdaGoktas {
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        int endTerm, firstTerm =0, secondTerm =1;
        System.out.println("Please enter the endterm");
        endTerm = input.nextInt();
        int nextTerm;
        for(int i=0; i<endTerm; i++){
            System.out.print(firstTerm + ", ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        }
    }

