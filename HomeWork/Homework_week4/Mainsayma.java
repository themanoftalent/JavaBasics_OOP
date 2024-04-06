// kaan şahin 2311502223
import java.util.Scanner;

public class Mainsayma {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int sayi;
        do{
            System.out.printf("100'den buyuk bir sayi giriniz:");

         sayi=input.nextInt();

        }while (sayi<100);
        for(int i=sayi;i>0;i--) {
            System.out.println(i);
        }


    }
}