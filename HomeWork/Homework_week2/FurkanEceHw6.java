import java.util.Scanner;

public class FurkanEceHw6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Palindromlugu kontrol edilecek olan sayiyi giriniz");
        int number = in.nextInt();
        
        int realNumber = number;
        int reverseNumber = 0;

        while(number != 0){
            int a = number % 10;
            reverseNumber = reverseNumber * 10 + a;
            number /= 10;    
        }
        if(reverseNumber ==realNumber){
            System.out.println("Girilen sayi polindrom sayidir");
        }
        else
            System.out.println("Girilen sayi polindrom sayi degildir");
    }
}