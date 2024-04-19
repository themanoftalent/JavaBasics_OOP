import java.util.Scanner;

public class Onur_M_U_Homework9PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Girininiz: ");
        int sayi = scanner.nextInt();

        if (isAsal(sayi)) {
            System.out.println(sayi + " Bir Asal Sayıdır.");
        } else {
            System.out.println(sayi + " Bir Bileşik Sayıdır.");
        }

        scanner.close();
    }

    public static boolean isAsal(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }
}
