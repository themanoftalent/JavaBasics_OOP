import java.util.Scanner;

public class FurkanEceHw7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Basamaklari toplami hesaplanacak sayiyi giriniz");
        int number = in.nextInt();
        int sumOfDigits = 0;

        while(number != 0){
            sumOfDigits += (number % 10);
            number -= number %10;
            number /= 10;
        }
        System.out.println("Girdiginiz sayinin basamaklari toplami:" + sumOfDigits);
    }
}