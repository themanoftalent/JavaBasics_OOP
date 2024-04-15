import java.util.*;
public class SeasonSwitchCaseSumeyyeElgin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.print("kaçıncı aydasınız: ");
        int month = scan.nextInt();

        switch (month) {
            case 12, 1 , 2:
                System.out.println("kış mevsimindesiniz");
                break;
            case 3, 4, 5:
                System.out.println("ilkbahar mevsimindesiniz");
                break;
            case 6, 7, 8:
                System.out.println("yaz mevsimindesiniz");
                break;
            case 9, 10, 11:
                System.out.println("sonbahar mevsimindesiniz");
                break;
            default:
                System.out.println("geçerli bir ay girmediniz.");
        }*/

        System.out.print("hangi aydasınız: ");
        String month = scan.nextLine().toLowerCase();

        switch (month) {
            case "aralık", "ocak", "şubat":
                System.out.println("kış mevsimindesiniz");
                break;
            case "mart", "nisan", "mayıs":
                System.out.println("ilkbahar mevsimindesiniz");
                break;
            case "haziran", "temmuz", "ağustos":
                System.out.println("yaz mevsimindesiniz");
                break;
            case "eylül", "ekim", "kasım":
                System.out.println("sonbahar mevsimindesiniz");
                break;
            default:
                System.out.println("geçerli bir ay girmediniz.");
        }
    }
}
