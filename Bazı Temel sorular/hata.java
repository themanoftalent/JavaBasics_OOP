package soru05;
import java.util.Arrays;

class hata {

    public static void main(String[] args) {

        int[] numbers = new int[5];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1 * 10;
        }

        printArrayContent(numbers);
    }

    public static void printArrayContent(int[] arr) {
        System.out.print("numbers dizisi içeriği: ");
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
