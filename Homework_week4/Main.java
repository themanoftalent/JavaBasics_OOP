import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Yılınızı giriniz: ");
        int dogumYili = input.nextInt();
        int yas = 2024 - dogumYili;
        System.out.println("Yaşınız: " + yas);

        switch ((int) yas) {
            case 0:
                System.out.println("Yeni dogdunuz");
                break;
            case 5:
                System.out.println("Ana okuluna gidiyorsunuz");
                break;
            case 10:
                System.out.println("Okula yeni basladinız");
                break;
            case 15:
                System.out.println("Lise zamanlarındasınız.");
                break;
            case 20:
                System.out.println("Üniversite zamanlarındasınız");
                break;
            default:
                System.out.println("Yaslanmıssınız");
                break;

        }
    }
}
Melih Evecen
