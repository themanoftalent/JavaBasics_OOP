
import java.util.Scanner;

public class Soru11 {
    //Calculate the sum and average of elements in an array.

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int toplam = 0;
        for (int num : arr) {
            toplam += num;
        }

        double ortalama = (double) toplam / n;

        System.out.println("Dizinin elemanlarının toplamı: " + toplam);
        System.out.println("Dizinin elemanlarının ortalaması: " + ortalama);

        scanner.close();
    }
}