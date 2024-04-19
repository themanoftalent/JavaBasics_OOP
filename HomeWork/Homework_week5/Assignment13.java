//bekir kaan şahin 2311502223
import java.util.*;
public class Assignment13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutu giriniz:");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println(size + " Tane tam sayi giriniz:");
        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Hangi sayiyi ariyorsunuz: ");
        int target = input.nextInt();

        int index = linearSearch(array, target);

        if (index != -1) {
            System.out.println("Aranan sayi " + index+ ". indexte");
        } else {
            System.out.println("Aranan sayi dizide yok");
        }

        input.close();
    }

    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}