//2311502210
//Factorial Calculator

import java.util.Scanner;
public class Asg4{
    public static void main(String[] args) {
        int fact = 1;
        Scanner factorial = new Scanner(System.in);
        System.out.println("Enter a number for factorial calculating: ");
        int number = factorial.nextInt();

        for(int i=1; i<=number; i++){
            fact *= i;
        }
        if(number>=0) {
            System.out.println("The factorial is " + fact);
        }
        else{
            System.out.println("This number have no factorial equality.");
        }
    }
}
