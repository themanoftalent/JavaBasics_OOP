import java.util.Scanner;

public class GurhanK_isim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsim girin: ");
        String ad = scanner.nextLine();
        System.out.print("Soyad girin: ");
        String soyad = scanner.nextLine();

        System.out.println("Merhaba: " + ad +" "+ soyad);

        if (ad.equals("Gurhan") && soyad.equals("Kaya")) {
            System.out.println("Sisteme hosgeldiniz");
        } else {
            System.out.println("Sistemde kayitli degilsiniz");
        }
    }
}
