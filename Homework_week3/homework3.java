import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner yenihafıza = new Scanner(System.in);
        System.out.println("isminizi giriniz:");
        String isim = yenihafıza.nextLine();
        System.out.println("soyisim giriniz:");
        String soyisim = yenihafıza.nextLine();
        System.out.println("İsmin ve soyismin: " + isim + " " + soyisim);

        if (isim.equals(soyisim)) {
            System.out.println("İsmin ve soyismin aynı");
        } else {
            System.out.println("İsmin ve soyismin farklı");
        }
    }
}