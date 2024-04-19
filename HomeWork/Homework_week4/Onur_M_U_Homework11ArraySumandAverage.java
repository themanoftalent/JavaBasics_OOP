import java.util.Scanner;

public class Onur_M_U_Homework11ArraySumandAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print("[" + (i + 1) + "] elemanı: ");
            dizi[i] = scanner.nextInt();
        }

        int toplam = 0;
        for (int num : dizi) {
            toplam += num;
        }
        double ortalama = (double) toplam / boyut;

        System.out.println("Dizinin toplamı: " + toplam);
        System.out.println("Dizinin ortalaması: " + ortalama);

        scanner.close();
    }
}
