import java.util.Scanner;

public class GurhanK_week6_ExceptionHandling {

    public static void main(String[] args) {
        int[] dizi = {10, 20, 30, 40, 50}; // Örnek bir dizi

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Görmek istediğiniz elemanın indisini girin: ");
            int indis = scanner.nextInt();

            int eleman = dizi[indis];
            System.out.println("Seçilen eleman: " + eleman);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Hata: Geçersiz indis! Lütfen geçerli bir indis girin.");
        } catch (Exception e) {
            System.out.println("Hata: Beklenmeyen bir hata oluştu. Program sonlandırılıyor.");
        } finally {
            scanner.close(); // Scanner'ı kapat
        }
    }
}
