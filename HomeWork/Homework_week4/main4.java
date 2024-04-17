import java.util.Scanner;

public class main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı girin:");
        int sayi = scanner.nextInt();


        for (int i = sayi; i >= 0; i--) {
            System.out.println(i);
        }
    }
}

