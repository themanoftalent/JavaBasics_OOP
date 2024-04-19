import java.util.Scanner;

public class Onur_M_U_Homework7SumOfDigits {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Pozitif bir tamsayı girin: ");
            int sayi = scanner.nextInt();

            int rakamlarToplami = toplamHesapla(sayi);

            System.out.println("Girilen sayının rakamlarının toplamı: " + rakamlarToplami);

            scanner.close();
        }
        public static int toplamHesapla(int sayi) {
            int toplam = 0;
            while (sayi != 0) {
                toplam += sayi % 10;
                sayi /= 10;
            }
            return toplam;
        }
    }
