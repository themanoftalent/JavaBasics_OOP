import java.util.Scanner;

public class GeriSay {

	public static void main(String[] args) {
		Scanner sayigir1= new Scanner(System.in);
		System.out.println("Sayi Giriniz: ");
		int sayi= sayigir1.nextInt();
		while(sayi<100) {
			System.out.println("sayı 100'den küçük, tekrar gir");
			sayi = sayigir1.nextInt();
		}
		for(int i=0;i<=sayi;sayi--) {
			System.out.println(sayi);
		}
		sayigir1.close();
		//Ali Eren Hakut 2311502229
	}
}
