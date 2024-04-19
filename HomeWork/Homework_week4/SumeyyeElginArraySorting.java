package hafta4;

import java.util.Arrays;
import java.util.Random;

public class SumeyyeElginArraySorting {
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] arr = new int[random.nextInt(4,10)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,25);
        }

        System.out.println("dizinin sıralanmadan önceki hali: " + Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println("dizinin sıralandıktan sonraki hali: " + Arrays.toString(arr));
    }
}
