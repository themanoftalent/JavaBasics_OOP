import java.util.Scanner;

public class DiziIslemleri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();
        
        int[] dizi = new int[boyut];
        int toplam = 0;

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = scanner.nextInt();
            toplam += dizi[i];
        }
        scanner.close();

        double ortalama = (double) toplam / boyut;

        System.out.println("Dizinin elemanlarının toplamı: " + toplam);
        System.out.println("Dizinin elemanlarının ortalaması: " + ortalama);
    }
}