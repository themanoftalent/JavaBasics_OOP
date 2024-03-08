import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner rand = new Scanner(System.in);
        Random random = new Random();

        int number = random.nextInt(101);

        System.out.print("Please, enter a number between 0-100: ");

        int guess = rand.nextInt();
        int counter = 0, counter1 = 0;

        while(guess != number){
            if(guess > 100 || guess < 0){
                System.out.println("The number you guess must be between 1 and 100!");
                System.out.print("Please, enter a number between 0-100: ");
                guess = rand.nextInt();
            }
            else if(guess < number){
                System.out.println("You're almost close! Please enter a larger number!");
                System.out.print("Please, enter a number between 0-100: ");
                guess = rand.nextInt();
                counter++;
            }
            else{
                System.out.println("You're almost close! Please enter a smaller number!");
                System.out.print("Please, enter a number between 0-100: ");
                guess = rand.nextInt();
                counter1++;
            }
        }

        int guess_number = counter + counter1 + 1;

        System.out.println("Congratulations! Number is " + number + ". You guessed the number correctly!");
        System.out.println("You guessed " + guess_number + " times!");

        rand.close();
    }
}
