package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Dizi boyutunu girin: ");
        int boyut = sc.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = sc.nextInt();
        }

        System.out.print("Aranacak elemanı girin: ");
        int arananEleman = sc.nextInt();

        int indis = linearSearch(dizi, arananEleman);

        if (indis != -1) {
            System.out.println(arananEleman + " elemanı dizinin " + indis + ". indeksinde bulundu.");
        } else {
            System.out.println(arananEleman + " dizide bulunamadı.");
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

