import java.util.Scanner;
public class Odev7 {
    public static void main(String[] args) {
        System.out.println("Rakamları toplanacak sayı girin");
        int rakamtoplam = 0;
        Scanner getsayi = new Scanner(System.in);
        int sayigir = getsayi.nextInt();
        if (sayigir == Math.abs(sayigir)){
            String sayininstringi = String.valueOf(sayigir);
            int uzunlugu = sayininstringi.length();
            for (int i =0 ;i<uzunlugu;i++){
                rakamtoplam += sayigir%10;
                sayigir = sayigir/10;
            }
        }
        else{
            System.out.println("Sayı negatif");
        }
        System.out.println("Girilen sayının rakamlarının toplamı = "+rakamtoplam);
    }
}
