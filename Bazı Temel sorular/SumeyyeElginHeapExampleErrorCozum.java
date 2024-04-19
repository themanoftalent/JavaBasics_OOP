package hafta7;

import java.util.Arrays;

public class SumeyyeElginHeapExampleErrorCozum {
    public static void main(String[] args) {
        //dizi ve dizi heap belleğine yazdır (yığın = hesap)

        int[] numbers = new int[5];

        //numbers dizisine elemanları atayalım

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }

        System.out.print("numbers dizisi içeriği: ");

        //yazdırma konusunda sıkıntı yaşıyorduk, ascii kodunu yazdırıyordu,iki şekilde çözdüm
        System.out.println(Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
