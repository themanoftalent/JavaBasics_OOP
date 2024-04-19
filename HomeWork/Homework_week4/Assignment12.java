// bekir kaan şahin 2311502223
public class Assignment12 {
    public static void main(String[] args) {
        int[] arr = {15, 7, 38, 3, 94, 26};

        System.out.println("Dizi:");
        printArray(arr);

        sıralama(arr);

        System.out.println("\nDizinin Tersi:");
        printArray(arr);
    }

    public static void sıralama(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {

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