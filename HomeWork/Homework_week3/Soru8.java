import java.util.Scanner;

public class Soru8 {

	public static void main(String[] args) {
		// Display the multiplication table of a number.
		System.out.println("Çarpım tablosu oluşturulacak sayıyı giriniz.");
		Scanner scanner = new Scanner(System.in);
		
		//çarpım tablosu oluşturulacak sayı
		int sayi = scanner.nextInt();
		
		for(int a = 1; a  < 11; a++)
		{
			System.out.println(a +"*"+sayi+"="+(a*sayi));		
		}	
	}
}
