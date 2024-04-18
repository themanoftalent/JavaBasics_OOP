package ödev12;

import java.util.Scanner;

class diziSırala {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu girin:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        bubbleSort(array);

        System.out.println("Sıralanmış dizi:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
	}

}
//Emiralp Yakalı 2311502251