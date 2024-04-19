import java.util.Scanner;

public class Soru7 {

	public static void main(String[] args) {
     //Calculate the sum of digits in a positive integer.
     System.out.println("Basamaklarının toplanmasını istediğiniz sayıyı giriniz:");
     Scanner scanner = new Scanner(System.in);
     int toplam = 0;
     int sayi = scanner.nextInt();     
     while (sayi > 0) {
         int basamak = sayi % 10;
         toplam += basamak;
         sayi /= 10;
     }
     System.out.println("Girdiğiniz sayının basamakları toplamı:"+ toplam);   
	}
}
