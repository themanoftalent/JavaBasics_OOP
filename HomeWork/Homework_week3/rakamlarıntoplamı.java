import java.util.Scanner;
public class rakamlarıntoplamı {
	  public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Pozitif bir tamsayı girin: ");
	        int number = scanner.nextInt();
	        scanner.close();

	        int sum = calculateDigitSum(number);
	        System.out.println("Girilen sayının rakamlarının toplamı: " + sum);
	    }

	    public static int calculateDigitSum(int n) {
	        int sum = 0;

	        while (n != 0) {
	            int digit = n % 10; // Son basamağı al
	            sum += digit; // Toplama ekle
	            n /= 10; // Son basamağı kaldır
	        }

	        return sum;
	    }
}
