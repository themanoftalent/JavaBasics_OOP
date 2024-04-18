w//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;

public class CihanAssigment13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of elements in the array:");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element at index " + i + ": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Element to search for:");
        int target = scanner.nextInt();
        int index = linearSearch(array, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index + ".");
        } else {
            System.out.println("Element " + target + " not found in the array.");
        }
    }
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}