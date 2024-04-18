import java.util.Scanner;

public class NgHomework17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num1 = scanner.nextInt();

        System.out.print("Bir sayı daha girin: ");
        int num2 = scanner.nextInt();
//ArithmeticException, aritmetik işlemler sırasında oluşan istisnaları temsil eden bir Java istisna sınıfıdır.
// Özellikle, bir sayının sıfıra bölünmesi durumunda (sıfıra bölme hatası) veya geçerli bir aritmetik işlem sonucunda taşma
// (overflow) durumunda bu istisna türü ortaya çıkar.
        try {
            int result = divide(num1, num2);
            System.out.println("Sonuç: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme hatası! " + e.getMessage());
        }
    }

    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
}

