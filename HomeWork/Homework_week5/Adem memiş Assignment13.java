import java.util.Scanner;
//2311502230 Adem memiş
public class Ders{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Dizinin kac elemandan olusacagini giriniz:");
        int terim = scan.nextInt();
        int[] dizi = new int[terim];
        for(int i=0;i<terim;i++){
            System.out.println("Elemanı giriniz: ");
            int eleman = scan.nextInt();
            dizi[i] = eleman;
        }
        System.out.println("Aranacak sayiyi giriniz:");
        int aranacaksayi = scan.nextInt();
        int  sayivarmi =0;
        for (int i =0 ;i < dizi.length ; i++){
            if (dizi[i] == aranacaksayi){
                System.out.println("Girdiğiniz sayi dizide bulunuyor :" + aranacaksayi);
                sayivarmi = 0;
                break;
            }
            else {
                sayivarmi = 1;
            }
        }
        if (sayivarmi == 1){
            System.out.println("Girdiğiniz sayi bu dizide yok");
        }
    }
}
