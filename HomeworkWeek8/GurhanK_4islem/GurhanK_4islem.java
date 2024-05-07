import java.util.InputMismatchException;
import java.util.Scanner;

public class GurhanK_4islem {

    //Metodlar
    public void Operations() {
        Scanner scanner = new Scanner(System.in);

        boolean devam = true;

        while (devam) {
            try {
                int islem;
                System.out.println("1 = Toplama ");
                System.out.println("2 = Çıkarma ");
                System.out.println("3 = Çarpma ");
                System.out.println("4 = Bölme ");
                System.out.print("İşlem Seç: ");

                islem = scanner.nextInt();

                System.out.print("1. Sayiyi girniz: ");
                double sayi1 = scanner.nextInt();

                System.out.print("2. Sayiyi giriniz: ");
                double sayi2 = scanner.nextInt();

                switch (islem) {
                    case 1:
                        System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2) + "\n");
                        devam = false;
                        break;
                    case 2:
                        System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2) + "\n");
                        devam = false;
                        break;
                    case 3:
                        System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2) + "\n");
                        devam = false;
                        break;
                    case 4:
                        if (sayi2 == 0) {
                            System.out.println("Hata: Sıfıra bölme hatası! \n");
                        } else {
                            System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2) + "\n");
                            devam = false;
                        }
                        break;
                    default:
                        System.out.println("Geçersiz işlem! Lütfen 1 ile 4 arasında bir işlem seçin. \n");
                        break;
                }
            }
            catch (InputMismatchException ex) {
                System.out.println("Hata: Geçersiz giriş! Lütfen bir tam sayı girin. \n");
                scanner.nextLine(); // Buffer temizleme, bu olmaz ise döngüye girer
            }
        }
        scanner.close();
    }
}
