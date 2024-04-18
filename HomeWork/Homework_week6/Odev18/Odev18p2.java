import java.util.Scanner;

public class Odev18p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bölünen sayıyı girin: ");
        int bölünen = scanner.nextInt();

        System.out.print("Bölen sayıyı girin: ");
        int bölen = scanner.nextInt();

        if (bölen != 0) {
            int result = divideNumbers(bölünen,bölen);
            System.out.println("Sonuç: " + result);
        } else {
            System.out.println("Hata: Sıfıra bölme hatası!");
        }

        scanner.close();
    }

    private static int divideNumbers(int bölünen, int bölen) {
        return bölünen / bölen;
    }
}
