import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[]args){
        System.out.println("Sayıyı giriniz.");
        Scanner hafıza=new Scanner(System.in);
        int i= hafıza.nextInt();
        if (i%2==0){
            System.out.println("Girilen sayı çift sayıdır.");
        }
        else{
            System.out.println("Girilen sayı tek sayıdır.");
        }
    }
}
