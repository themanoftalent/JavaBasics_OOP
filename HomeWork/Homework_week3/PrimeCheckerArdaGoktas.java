// Arda Göktaş 2311502241
import java.util.*;
public class PrimeCheckerArdaGoktas {
    public static boolean isPrime(int num){
        for(int i=2; i<= num/2; i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.println("Please enter a number");
        num = input.nextInt();
        if(isPrime(num)){
            System.out.println(num + " is a prime number :)");
        }
        else{
            System.out.println(num + " is not a prime number !!");
        }
        
    }
}
