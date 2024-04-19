package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Fibonacci diziniz kaç sayılı olsun? : ");
        int sayi = sc.nextInt();

        System.out.println("Fibonacci Diziniz:");
        for (int i = 0; i < sayi; i++) {
            System.out.println(fibonacci(i));
        }
    }

    public static int fibonacci(int number) {
        if (number == 0)
            return 0;
        else if (number == 1)
            return 1;
        else
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
