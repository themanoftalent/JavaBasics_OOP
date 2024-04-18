//Arda Goktas 2311502241
public class ArraySortingArdaGoktas {
    public static void main(String[] args) {
        int[] arr = {12, 1, 16, 8, 67, 4};

        System.out.println("Original array:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nSorted array:");
        printArray(arr);
    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}