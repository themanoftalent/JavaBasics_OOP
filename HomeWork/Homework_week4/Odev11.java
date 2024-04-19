import java.util.Scanner;
public class Odev11 {
    public static void main(String[] args) {
        Scanner getsayi = new Scanner(System.in);
        int uzunluk = getsayi.nextInt();
        int[] sayidizisi = new int[uzunluk];
        for (int i = 0;i<uzunluk;i++){
            sayidizisi[i] = getsayi.nextInt();
        }
        int toplam = 0;
        for (int i = 0;i < uzunluk;i++){
            toplam += sayidizisi[i];
        }
        float aritmetik = toplam/uzunluk;
        System.out.println("Bu dizideki sayıların toplamı = "+toplam+" ve aritmetik ortalaması = "+ aritmetik );
    }
}
