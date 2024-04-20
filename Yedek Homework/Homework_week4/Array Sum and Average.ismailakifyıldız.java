import java.util.Scanner;
public class Main34 {

	public static void main(String[] args) {
			int[] numbers = new int[10];
			Scanner scanner = new Scanner(System.in);
			System.out.println("Girilen 10 sayının ortalamasını hesaplama kodu");
			for (int a=0; a<10; a++) {
				System.out.println(a+1+". sayıyı giriniz: ");
					numbers[a]= scanner.nextInt();
					}
			int c=0;
			for (int b=0; b<10; b++) {
			c = c + numbers[b];
	}
			scanner.close();
			System.out.println("Dizinin toplamı = "+c);
			System.out.println("Dizinin ortalaması = "+c/10);
	}}
