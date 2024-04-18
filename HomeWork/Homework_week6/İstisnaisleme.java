package Ödevler6.hafta;

//2311502229 Ali Eren Hakut
public class İstisnaisleme {

	public static void main(String[] args) {
		int pay = 10;
		int payda = 0;

		try {
			int sonuc = pay / payda;
			System.out.println("Sonuç: " + sonuc);
		} catch (ArithmeticException e) {
			System.err.println("Sıfıra bölme hatası: " + e.getMessage());
			e.printStackTrace();
		}
	}
}
