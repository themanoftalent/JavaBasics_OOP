import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[]args){
        System.out.println("İşlem yapmak istediğiniz değerleri giriniz.");
        Scanner hafıza=new Scanner(System.in);
        int i= hafıza.nextInt();
        int k= hafıza.nextInt();
        int toplam=i+k;
        int fark=i-k;
        int çarpım=i*k;
        int bölüm=i/k;
        System.out.println("Toplam=" +toplam);
        System.out.println("Fark=" +fark);
        System.out.println("Çarpım=" +çarpım);
        System.out.println("Bölüm=" +bölüm);
    }
}
