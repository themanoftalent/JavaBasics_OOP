import java.util.Scanner;

public class NgHomework13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Dizinin boyutunu girin: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Dizinin elemanlarını girin:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }


        System.out.print("Aranacak öğeyi girin: ");
        int target = scanner.nextInt();


        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println(target + " öğesi dizide bulundu, indis: " + index);
        } else {
            System.out.println(target + " öğesi dizide bulunamadı.");
        }
    }
}
