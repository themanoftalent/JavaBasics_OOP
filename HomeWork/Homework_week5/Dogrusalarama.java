package ödev13;

import java.util.Scanner;

class dogrusalArama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu girin:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Aranacak elemanı girin:");
        int target = scanner.nextInt();

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Eleman " + index + ". pozisyonda bulundu.");
        } else {
            System.out.println("Eleman bulunamadı.");
        }

        scanner.close();
    }

    public static int linearSearch(int[] array, int target) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            if (array[i] == target) {
                return i; 
            }
        }
        return -1; 

	}

}
//Emiralp Yakalı 2311502251