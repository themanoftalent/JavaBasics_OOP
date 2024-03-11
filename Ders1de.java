import java.util.Scanner;  
public class Ders1de {

	public static void main(String[] args) {
		Scanner mustafaScanner=new Scanner(System.in);
		System.out.println("bir sayı gir:");
		int sayi1=mustafaScanner.nextInt();
		System.out.println("ikinci sayıyı gir:");
		int sayi2=mustafaScanner.nextInt();
		int toplam=sayi1+sayi2;
		System.out.println("toplam="+toplam);

	}

}
