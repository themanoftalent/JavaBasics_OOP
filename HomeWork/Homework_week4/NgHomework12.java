import java.util.Scanner;

public class NgHomework12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("dizinin boyutunu girin:");

        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.printf("dizinin elemanlrını girin:");


        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }

            }
        }
        System.out.println("Dizinin büyükten küçüğe sıralanmış hali:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
