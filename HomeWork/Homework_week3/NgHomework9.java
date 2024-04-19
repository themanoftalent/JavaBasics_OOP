import java.util.Scanner;

public class NgHomework9 {
    public static void main(String[] args) {

        System.out.printf("Bir sayı girin: ");
        Scanner scanner = new Scanner(System.in);
        int sayi = scanner.nextInt();
        boolean asalMi = true;

        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                asalMi = false;
                break;
            }
        }

        if (asalMi) {
            System.out.printf("%d bir asal sayıdır.%n", sayi);
        } else {
            System.out.printf("%d bir asal sayı değildir.%n", sayi);
        }
    }
}

