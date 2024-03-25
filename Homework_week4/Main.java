import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Hangi Aydasınız? ");
        String ay = input.nextLine();
        switch (ay) {
            case "Ocak":
            case "Şubat":
            case "Aralık":
                System.out.println("Kışdasınız");
                break;
            case "Mart":
            case "Nisan":
            case "Mayıs":
                System.out.println("İlkbahardasınız");
                break;
            case "Haziran":
            case "Temmuz":
            case "Ağustos":
                System.out.println("Yazdasınız");
                break;
            case "Eylül":
            case "Ekim":
            case "Kasım":
                System.out.println("Sonbahardasınız");
                break;
            default:
                System.out.println("Yanlış ay girdiniz");
        }
    }
}
