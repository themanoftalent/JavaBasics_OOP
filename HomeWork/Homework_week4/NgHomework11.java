import java.util.Scanner;

public class NgHomework11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutunu girin: ");
        int n= scanner.nextInt();

        int[] array = new int[n];
        int toplam=0;

        System.out.println("Dizinin elemanlarını girin:");

        for(int i=0;i<n;i++){
            array[i] = scanner.nextInt();
            toplam+=array[i];
        }
        double ortalama=(double) toplam/n;

        System.out.println(toplam);

        System.out.println(ortalama);
    }
}
