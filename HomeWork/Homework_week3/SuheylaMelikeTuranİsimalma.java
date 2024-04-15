import java.util.Scanner;

public class İsimsoyisimkontrol {
    public static void main(String[]args){
        Scanner yenihafıza = new Scanner(System.in);
        System.out.println("İsiminizi giriniz.");
        String ad = "Süheyla Melike";
        String isim = yenihafıza.nextLine();
        System.out.println("Soyisminizi giriniz.");
        String soyisim= yenihafıza.nextLine();
        System.out.println("İsminiz:"+ isim  +soyisim);
        if (isim.equals(ad) && soyisim.equals("Turan")){
            System.out.println("Hoşgeldin Süheyla Melike Turan");
        }
        else {
            System.out.println("HATA");
        }
    }
}
