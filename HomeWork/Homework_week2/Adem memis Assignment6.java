import java.util.Scanner;

public class Ders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scan.nextInt();
        int kontrol = sayi,toplam=0;

        while(kontrol>0){
            toplam = toplam * 10;
            toplam = toplam + kontrol % 10;
            kontrol = kontrol / 10;
        }
        if(toplam == sayi){
            System.out.println("Palindrom sayı.");
        }
        else{
            System.out.println("Palindrom sayı değil.");
        }
    }
}
