package Week7;

import java.util.Arrays;

public class YağızZorluHeapExample {

    public static void main(String[] args) {
        int[] numbers = new int[5];

//numbers dizisine elemanları atayalım

        for(int i = 0; i< numbers.length; i++) {
            numbers[i] = i*10;
        }
        System.out.println("Numbers dizisi içeriği : " + (Arrays.toString(numbers)));
//[25,63,1,5,9]  index kayıt sırasını tutuyor ve sıfırdan başlamaktadır.
    }
}
                                                                  //Yağız Zorlu
