import java.util.Scanner;

public class Soru18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Bölünen sayıyı giriniz: ");
            int bolunen = scanner.nextInt();

            System.out.print("Bölen sayıyı giriniz: ");
            int bolen = scanner.nextInt();

            double sonuc = bolumHesapla(bolunen, bolen);
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Bir hata oluştu: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    public static double bolumHesapla(int bolunen, int bolen) {
        if (bolen == 0) {
            throw new ArithmeticException("Bölme sıfıra hatası: Bölen sıfır olamaz.");
        }
        return (double) bolunen / bolen;
    }
}

