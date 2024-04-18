// Ahmet Talha Bodur 2311502242
// Implement binary search on a sorted array.

import java.util.*;

public class talhaAssignment14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Enter the size of the sorted array: ");
        int size = input.nextInt();


        int[] array = new int[size];


        System.out.println("Enter " + size + " integers in sorted order:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }


        System.out.print("Enter the element to search for: ");
        int target = input.nextInt();


        int index = binarySearch(array, target);


        if (index != -1) {
            System.out.println("Element found at index " + index);
        } else {
            System.out.println("Element not found in the array");
        }

        input.close();
    }


    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;


            if (array[mid] == target) {
                return mid;
            }


            if (array[mid] < target) {
                left = mid + 1;
            }

            else {
                right = mid - 1;
            }
        }


        return -1;
    }
}
