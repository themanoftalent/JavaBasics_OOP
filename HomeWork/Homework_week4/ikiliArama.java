package ödev14;

import java.util.Scanner;

class ikiliArama {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Dizinin boyutunu girin:");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Sıralı dizinin elemanlarını girin:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.println("Aranacak elemanı girin:");
        int target = scanner.nextInt();

        int index = binarySearch(array, target);

        if (index != -1) {
            System.out.println("Eleman " + index + ". pozisyonda bulundu.");
        } else {
            System.out.println("Eleman bulunamadı.");
        }

        scanner.close();
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid;
            }
            else if (array[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return -1;
	}

}
//Emiralp Yakalı 2311502251