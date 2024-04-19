import java.util.Scanner;

public class FurkanEceHw8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Carpim tablosundaki yerleri gosterilecek olan sayiyi giriniz...");
        int number = in.nextInt();

        int[] multiplaction = new int[10];

        for(int i=0; i<10; i++){
            multiplaction[i] = number * i;
            System.out.println(number + " x " + i + " = " + multiplaction[i]);
        }      

    }
}