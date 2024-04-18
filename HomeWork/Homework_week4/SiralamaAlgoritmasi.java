import java.util.Scanner;

public class SiralamaAlgoritmasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = scanner.nextInt();
        
        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemanı girin: ");
            dizi[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = 0; i < boyut - 1; i++) {
            for (int j = 0; j < boyut - i - 1; j++) {
                if (dizi[j] > dizi[j + 1]) {
                    
                    int temp = dizi[j];
                    dizi[j] = dizi[j + 1];
                    dizi[j + 1] = temp;
                }
            }
        }

        // Sıralanmış diziyi ekrana yazdır
        System.out.println("Sıralanmış dizi:");
        for (int num : dizi) {
            System.out.print(num + " ");
        }
    }
}