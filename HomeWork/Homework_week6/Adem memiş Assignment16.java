import java.util.Scanner;
public class Ders { İ
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = scanner.nextInt();

        if (Armstrongsayisimi(sayi)) {
            System.out.println(sayi + " Armstrong sayisidir.");
        } else {
            System.out.println(sayi + " Armstrong sayisi değildir.");
        }
    }
    public static boolean Armstrongsayisimi(int sayi) {
        int girilensayi = sayi;
        int rakam = String.valueOf(sayi).length();
        int toplam = 0;
        while (sayi > 0) {
            int digit = sayi % 10;
            toplam += Math.pow(digit, rakam);
            sayi /= 10;
        }
        return toplam == girilensayi;
    }
}
