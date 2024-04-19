import java.util.Scanner;

public class IstisnaYakalamaOrnegi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("İlk sayıyı girin:");
            int num1 = scanner.nextInt();
            
            System.out.println("İkinci sayıyı girin:");
            int num2 = scanner.nextInt();
            
            int result = bolum(num1, num2);
            System.out.println("Bölme işleminin sonucu: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme hatası!");
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    public static int bolum(int num1, int num2) {
        return num1 / num2;
    }
}