package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");
        int boyut = sc.nextInt();

        int[] dizi = new int[boyut];


        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < boyut; i++) {
            dizi[i] = sc.nextInt();
        }

        bubbleSort(dizi);

        System.out.println("Sıralanmış dizi:");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + " ");
        }
    }

    public static void bubbleSort(int[] arr) {
        int number = arr.length;
        for(int i = 0; i< number - 1; i++) {
            for(int j = 0; i< number - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
