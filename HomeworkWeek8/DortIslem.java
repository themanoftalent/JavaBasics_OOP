package Class;
//Ali Eren Hakut 2311502229
import java.util.Scanner;

public class DortIslem {
	public void Operations() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("İlk sayıyı girin:");
		double sayi1 = scanner.nextDouble();

		System.out.println("İkinci sayıyı girin:");
		double sayi2 = scanner.nextDouble();

		System.out.println("İşlemi seçin (+, -, *, /):");
		char islem = scanner.next().charAt(0);

		double sonuc = 0;
		boolean hata = false;

		try {
			switch (islem) {
			case '+':
				sonuc = sayi1 + sayi2;
				break;
			case '-':
				sonuc = sayi1 - sayi2;
				break;
			case '*':
				sonuc = sayi1 * sayi2;
				break;
			case '/':
				if (sayi2 == 0) {
					throw new ArithmeticException("Sıfıra bölme hatası!");
				}
				sonuc = sayi1 / sayi2;
				break;
			default:
				System.out.println("Geçersiz işlem!");
				hata = true;
			}

			if (!hata) {
				System.out.println("Sonuç: " + sonuc);
			}
		} catch (ArithmeticException e) {
			System.out.println("Hata: " + e.getMessage());
		}

		scanner.close();
	}

	public static void main(String[] args) {
		DortIslem kayit = new DortIslem();
		kayit.Operations();
	}
}
