import java.util.Arrays;
import java.util.Scanner;

public class EmreYilmazHomework10ReverseaString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz: ");
        int terim = sc.nextInt();

        int[] numbers = new int[terim];
        int[] tersnumbers = new int[numbers.length];

        for(int i = 0;i<terim;i++){
            System.out.println("Elemanı giriniz: ");
            int eleman = sc.nextInt();
            numbers[i] = eleman;
        }

        int j = 0;

        for(int i = numbers.length-1; i>=0; i--){
            tersnumbers[j] = numbers[i];
            j++;
        }
        System.out.println(Arrays.toString(tersnumbers));

    }
}