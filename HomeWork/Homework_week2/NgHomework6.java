import java.util.Scanner;

public class NgHomework6 {
    public static void main(String[] args){
int tersSayi=0;
        System.out.println("bir sayi giriniz:");

        Scanner scanner= new Scanner(System.in);
        int sayi= scanner.nextInt();
int orijinalSayi=sayi;

        while(sayi>0){
            int sonBasamak= sayi%10 ;
            tersSayi=tersSayi*10+sonBasamak;
            sayi= sayi/=10;
        }

        if(orijinalSayi == tersSayi){
            System.out.println("palindrom sayıdır");
        } else {
            System.out.println("palindrom sayi değildir");
        }
    }
}
