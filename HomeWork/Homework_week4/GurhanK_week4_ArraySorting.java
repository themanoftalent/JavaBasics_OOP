public class GurhanK_week4_ArraySorting {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // son sırlar sırlanmış olduğu için n - i şeklinde
                // Eğer şu anki eleman bir sonrakinden büyükse, swap yap
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Diziyi ekrana yazdırmak için yardımcı fonksiyon
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Dizinin sıralanmamış hali:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("Bubble Sort ile sıralanmış hali:");
        printArray(arr);
    }
}
