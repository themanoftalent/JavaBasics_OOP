import java.util.Scanner;

public class Onur_M_U_Homework13LinearSearch {
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

        System.out.print("Aranacak öğeyi girin: ");
        int aranan = scanner.nextInt();


        int index = linearSearch(dizi, aranan);

        if (index != -1) {
            System.out.println("Aranan öğe " + aranan + " dizinin " + (index + 1) + ". indeksinde bulundu.");
        } else {
            System.out.println("Aranan öğe bulunamadı.");
        }

        scanner.close();
    }

    public static int linearSearch(int[] dizi, int aranan) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                return i;
            }
        }
        return -1;
    }
}
