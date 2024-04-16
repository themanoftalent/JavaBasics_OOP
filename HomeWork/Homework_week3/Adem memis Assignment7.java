import java.util.Scanner;
public class Ders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scan.nextInt();
        int kontrol = sayi,toplam=0;

        while(kontrol>0){
            toplam = toplam + kontrol%10;
            kontrol = kontrol / 10;

        }
        System.out.println(toplam);
    }
}
