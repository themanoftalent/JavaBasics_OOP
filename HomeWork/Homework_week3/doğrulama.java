import java.util.Scanner;

public class doğrulama {
    public static void main(String[] args) {
        Scanner emirscanner = new Scanner(System.in);

        System.out.print("Adınızı Girin: ");
        String ad = emirscanner.nextLine();

        System.out.print("Soyadınızı girin: ");
        String soyad = emirscanner.nextLine();

        // String ifadelerin eşitliğini kontrol etmek için equals() metodunu kullanın
        if ((ad + " " + soyad).equals("Emiralp Yakalı")) {
            System.out.println(ad + " " + soyad);
        } else {
            System.out.println("Yanlış isim girdiniz!");
        }
    }
}