package mainn;
import java.util.Scanner;
public class mainn {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Bir sayı girin:");
	        int sayi1 = scanner.nextInt();

	        System.out.println("Bir sayı daha girin:");
	        int sayi2 = scanner.nextInt();

	        try {
	            int sonuc = sayi1 / sayi2;
	            System.out.println("Sonuç: " + sonuc);
	        } catch (ArithmeticException e) {
	            System.out.println("Sıfıra bölme hatası: " + e.getMessage());
	        }
	    }
	}

