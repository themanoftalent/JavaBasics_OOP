import java.util.Scanner;
public class Ders {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("İki adet sayi giriniz:");
        int sayi1 = scan.nextInt();
        int sayi2 = scan.nextInt();

        int topla = sayi1+sayi2;
        int cikar = sayi1-sayi2;
        int carp = sayi1*sayi2;
        int bol = sayi1/sayi2;

        System.out.println("Toplam:"+topla+" "+"Cikarma:"+cikar+" "+"Carpım:"+carp+" "+"Bolum:"+bol);


    }
}
