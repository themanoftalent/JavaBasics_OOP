import java.util.Scanner;

public class GurhanK_week4_ReversString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir metin girin: ");
        String orijinalMetin = scanner.nextLine();

        String tersMetin = metniTersCevir(orijinalMetin);

        System.out.println("Tersine çevrilmiş metin: " + tersMetin);

        scanner.close();
    }

    // String'i tersine çeviren metot
    public static String metniTersCevir(String metin) {
        int uzunluk = metin.length();
        char[] tersDizi = new char[uzunluk];

        // Karakterleri ters dizide saklama
        for (int i = 0; i < uzunluk; i++) {
            tersDizi[i] = metin.charAt(uzunluk - 1 - i);
        }

        // Tersine çevrilmiş diziyi string olarak oluşturma
        String tersMetin = new String(tersDizi);
        return tersMetin;
    }
}
