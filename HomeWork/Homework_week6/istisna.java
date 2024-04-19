package ödev18;

import java.util.Scanner;

class istisna {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Bir sayıyı girin:");
            int num1 = scanner.nextInt();

            System.out.println("Bir sayıyı daha girin:");
            int num2 = scanner.nextInt();

            double result = divide(num1, num2);
            System.out.println("İşlem sonucu: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme hatası!");
        } catch (Exception e) {
            System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
        } finally {
            scanner.close(); 
        }
    }

    public static double divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Sıfıra bölme hatası!"); 
        }
        return (double) num1 / num2;

	}

}
//Emiralp Yakali 2311502251