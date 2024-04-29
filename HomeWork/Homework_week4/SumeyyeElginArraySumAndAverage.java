package hafta4;

import java.util.Arrays;
import java.util.Random;

public class SumeyyeElginArraySumAndAverage {

    public static int sum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double average(int[] arr) {
        return (double) sum(arr) / arr.length;
    }

    public static void main(String[] args) {
        Random randomNum = new Random();
        int[] arrayNum = new int[randomNum.nextInt(4,13)];

        for (int i = 0; i < arrayNum.length; i++) {
            arrayNum[i] = randomNum.nextInt(1,25);
        }


        System.out.println(Arrays.toString(arrayNum));
        System.out.println("dizinin elemanlarının toplamı: " + sum(arrayNum));
        System.out.println("dizinin elemanlarının ortalaması: " + average(arrayNum));
    }
}
