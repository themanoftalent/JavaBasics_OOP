
import java.util.Scanner;

public class MevsimHesaplaması {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ay ismi gir");
        String ay = scanner.nextLine();
        switch (ay) {
            case "aralık":
            case "ocak":
            case "şubat":
                System.out.println("kış");
                break;
            case "mart":
            case "nisan":
            case "mayıs":
                System.out.println("ilkbahar");
                break;
            case "haziran":
            case "temmuz":
            case "ağustos":
                System.out.println("yaz.");
                break;
            case "eylül":
            case "ekim":
            case "kasım":
                System.out.println("sonbahar");
                break;
            default:
                System.out.println("geçerli bi ay ismi gir");
                break;

        }
    }
}
