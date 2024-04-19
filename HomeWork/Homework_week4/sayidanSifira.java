// Talha Bodur / 2311502242;
import java.util.*;
public class sayidanSifira {
    static Scanner input =new Scanner(System.in);
    public static void main (String[]args){

        int sayi;
        do {
            System.out.println("Sayi giriniz:");
            sayi = input.nextInt();
        }
        while (sayi<100);

        for (int i=sayi; i>0; i--){
            System.out.println(i);
        }

    }

}