import java.security.KeyStore.TrustedCertificateEntry;
import java.util.Scanner;

public class Soru9 {

	public static void main(String[] args) {
		// Check if a given number is prime or composite.
		System.out.println("Asallığı test edilecek sayıyı giriniz:");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt();
		boolean kontrol = true;
		if (input <= 1)
			kontrol = false;
		else if (input == 3)
			kontrol = true;
		else {
			for (int a = 2; a <= input / 2; a++) {
				if (input % a == 0) {
					kontrol = false;
				}

			}
		}
		if (kontrol == true)
			System.out.println("Girdiğiniz sayı asaldır");
		else
			System.out.println("Girdiğiniz sayı asal değildir");

	}

}
