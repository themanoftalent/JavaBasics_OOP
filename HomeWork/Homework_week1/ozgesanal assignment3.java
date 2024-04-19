//2311502210
//Even or Odd

import java.util.Scanner;
public class Asg3{
    public static void main(String[] args) {
        Scanner isEvenorOdd = new Scanner(System.in);

        System.out.println("Enter a number in integer and we'll say its even or odd!");
        int number = isEvenorOdd.nextInt();

        if(number%2==0){
            System.out.println("Its even!");
        }
        else if(number%2!=0){
            System.out.println("Its odd!");
        }
        else{
            System.out.println("You have to type in integers.");
        }
    }
}
