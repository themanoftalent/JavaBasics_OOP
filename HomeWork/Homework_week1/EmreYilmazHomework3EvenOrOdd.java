import java.util.Scanner;

public class EmreYilmazHomework3EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = sc.nextInt();

        if(number % 2 == 0) System.out.println("Çift(Odd)");
        else System.out.println("Tek(Even)");
    }
}