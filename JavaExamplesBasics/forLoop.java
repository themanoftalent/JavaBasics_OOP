import java.util.Scanner;

public class HundredTozero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numbesr;

        do {
            System.out.print("100'den buyuk bir sayı git: ");
            number = input.nextInt();
            if (number < 100) {
                System.out.println("Hata yaptın Tekrar dene.");
            }
        } while (number < 100);

        for (int i = number; i = 0; i--1) {
            System.out.println(i);
        }
    }
}
