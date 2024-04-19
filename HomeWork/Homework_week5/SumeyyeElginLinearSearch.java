package hafta5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumeyyeElginLinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[random.nextInt(3,6)];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(1,10);
        }

        System.out.print("lütfen dizide aradığınız sayıyı girin: ");
        int target = scan.nextInt();

        System.out.println(Arrays.toString(arr));

        int resultIndex = linearSearch(arr, target);

        if (resultIndex != -1) {
            System.out.println(target + ", dizinin " + resultIndex + ". indexinde bulundu.");
        } else {
            System.out.println(target + ", dizide bulunamadı.");
        }
    }
}
