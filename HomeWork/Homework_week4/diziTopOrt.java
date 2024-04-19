package ödev11;

import java.util.Scanner;

class diziTopOrt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu girin:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / size;

        System.out.println("Dizinin elemanlarının toplamı: " + sum);
        System.out.println("Dizinin elemanlarının ortalaması: " + average);

        scanner.close();
	}

}
//Emiralp Yakalı 2311502251