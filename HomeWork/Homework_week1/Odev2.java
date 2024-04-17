import javax.sound.midi.Soundbank;
import java.util.Scanner;
public class Odev2 {
    public static void main(String[] args) {
        System.out.println("Toplama yapmak için 1//Çıkarma yapmak için 2// Bölme yapmak için 3// Çarpma için 4 sayısını //Modunu almak için 5 sayısını giriniz");
        Scanner getsayi = new Scanner(System.in);
        int islemsayisi = getsayi.nextInt();
        System.out.println("Ardından 2 sayı giriniz");
        int sayi1,sayi2;
        sayi1 = getsayi.nextInt();
        sayi2 = getsayi.nextInt();
        if (islemsayisi == 1){
            System.out.println("seçilen 2 sayının toplamı :"+ (sayi1+sayi2));
        }
        else if( islemsayisi == 2){
            System.out.println("seçilen 2 sayının çıkartılmasının sonucu:" + (sayi1-sayi2));
        }
        else if (islemsayisi == 3) {
            System.out.println("seçilen 2 sayının bölümü:"+(sayi1/sayi2) );
        }
        else if (islemsayisi == 4) {
            System.out.println("seçilen 2 sayının çarpımı: " + (sayi1*sayi2));
        }
        else if (islemsayisi == 5) {
            System.out.println("seçilen2 sayının modu:" + (sayi1%sayi2));

        }
    }
}
