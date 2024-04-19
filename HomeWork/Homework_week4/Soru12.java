
import java.util.Scanner;

public class Soru12 {
	  public static void main(String[] args) {
		//Implement a sorting algorithm for an integer array.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu giriniz: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Dizinin elemanlarını giriniz:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        bubbleSort(arr);

        System.out.println("Sıralanmış dizi:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}