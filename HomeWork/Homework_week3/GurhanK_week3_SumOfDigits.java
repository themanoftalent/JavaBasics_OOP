import java.util.Scanner;

public class GurhanK_week3_SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz: ");
        int sayi1 = scanner.nextInt();
        System.out.println("İkinci sayiyi giriniz: ");
        int sayi2 = scanner.nextInt();

        int toplam = sayi1 + sayi2;

        System.out.println("Girilen sayilarin toplami: " + toplam);
    }
}
