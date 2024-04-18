import java.util.Scanner;

public class Onur_M_U_Homework2SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1. Sayı :");
        int a = scan.nextInt();
        System.out.print("2. Sayı :");
        int b = scan.nextInt();

        System.out.println("İşlem Seçiniz : ");
        System.out.println("1 - Toplama");
        System.out.println("2 - Çıkarma");
        System.out.println("3 - Çarpma");
        System.out.println("4 - Bölme");
        System.out.println("İşleminiz :");
        int select = scan.nextInt();
        double sonuc = 0;

        if (select == 1) {
            sonuc = a + b ;
        } else if (select == 2) {
            sonuc = a - b ;
        } else if (select == 3) {
            sonuc = a * b ;
        } else if (select == 4) {
            if (b == 0) {
                System.out.println("Bölen sayısı sıfır olamaz !");
            } else {
                sonuc = a / (double) b ;

            }
        }else {
            System.out.println("Lütfen geçerli bir işlem seçiniz ");
        }
        System.out.println("sonuc :" + sonuc);
    }
}