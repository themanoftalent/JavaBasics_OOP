public class GurhanK_week4_ArraySumAndAverage{

    //dizideki elemanları toplar
    public static double Sum(int[] arr) {
        double toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        return toplam;
    }

    // Ortalama alır
    public static double Average(int[] arr, double toplam) {
        double ortalama = 0;
        ortalama = toplam / arr.length;
        return ortalama;
    }

    // dizi yazdırır
    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Dizi: ");
        printArray(arr);

        double toplam_main = Sum(arr);

        System.out.println("Dizideki sayilarin toplanmis hali: " + (toplam_main));
        System.out.println("Dizideki sayilarin toplanmis hali: " + (Average(arr,toplam_main)));
    }
}
