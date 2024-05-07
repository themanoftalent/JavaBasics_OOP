import java.util.Scanner;
public class Odev13 {
    public static void main(String[] args) {
        Scanner getinfo = new Scanner(System.in);
        System.out.println("2 Dizimiz olsun ve bu diziler meyve ve sayılardan oluşsun");
        System.out.println("Dizide arayacağınız meyveyi yazınız");
        String meyve = getinfo.nextLine();
        System.out.println("Sayı dizisinde arayacağınız sayıyı giriniz");
        int aranacaksayi = getinfo.nextInt();
        String[] meyveler = {"elma","armut","kiraz","çilek","muz","portkal","karpuz","üzüm","nar","ananas"};
        int[] sayidizisi ={1,2,3,4,11,23,42,51,521,6,7,9,25,8};
        int meyveflag =0;
        for (int i =0;i < meyveler.length;i++){
            if (meyveler[i].equals(meyve)){
                System.out.println("Aradığınız meyve dizide bulunuyor :"+ meyveler[i]);
                meyveflag =0;
                break;
            }
            else {
                meyveflag = 1;
            }
        }
        if (meyveflag == 1){
            System.out.println("Girdiğiniz meyve dizide bulunmuyor");
        }
        int  sayiflag =0;
        for (int i =0 ;i < sayidizisi.length ; i++){
            if (sayidizisi[i] == aranacaksayi){
                System.out.println("Girdiğiniz sayı dizide bulunuyor :" + aranacaksayi);
                sayiflag = 0;
                break;
            }
            else {
                sayiflag = 1;
            }
        }
        if (sayiflag == 1){
            System.out.println("Girdiğiniz sayı bu dizide yok");
        }

    }
}
