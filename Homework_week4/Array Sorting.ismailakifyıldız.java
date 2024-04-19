import java.util.Arrays;
import java.util.Scanner;
public class Main35 {

	public static void main(String[] args) {
		// Girilen 5 sayıyı büyükten küçüğe sıralama
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Girilen 5 sayıyı sıralama");
		for (int a=0; a<5; a++) {
			System.out.println(a+1+". sayıyı giriniz: ");
				numbers[a]= scanner.nextInt();
	}
		Arrays.sort(numbers);
		for (int a=4; a>=0; a--) {
			
			System.out.print(numbers[a]+">");
		}
		
		
}}
