
import java.util.Scanner;
public class adsoyad {
    public static void main(String[]args){
        Scanner hafiza= new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        String isim= hafiza.nextLine();
        System.out.println("Soyisminizi giriniz");
        String soyisim= hafiza.nextLine();
        System.out.println("Adınız ve soyadınız:"+isim+" "+soyisim+"\n");

        if(isim.equals("Ceyda")&& soyisim.equals("Ankara")){
            System.out.println("HOSGELDİNİZ Ceyda Ankara");
        }
        else {
            System.out.println("Yanlış");;
        }
    }

}
//CEYDA ANKARA
