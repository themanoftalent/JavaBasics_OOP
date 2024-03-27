
import java.util.Scanner;
public class Ay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ay giriniz.");
        String ay = sc.nextLine();

        switch(ay){
            case ("Ocak"):
                System.out.println("1. ay kış");
                break;
            case ("Şubat"):
                System.out.println("2. ay kış");
                break;
            case ("Mart"):
                System.out.println("3. ay ilkbahar");
                break;
            case ("Nisan"):
                System.out.println("4. ay ilkbahar");
                break;
            case ("Mayıs"):
                System.out.println("5. ay ilkbahar");
                break;
            case ("Haziran"):
                System.out.println("6. ay yaz");
                break;
            case ("Temmuz"):
                System.out.println("7. ay yaz");
                break;
            case ("Ağustos"):
                System.out.println("8. ay yaz");
                break;
            case ("Eylül"):
                System.out.println("9. ay sonbahar");
                break;
            case ("Ekim"):
                System.out.println("10. ay sonbahar");
                break;
            case ("Kasım"):
                System.out.println("11. ay sonbahar");
                break;
            case ("Aralık"):
                System.out.println("12. ay kış");
                break;
            default:
                System.out.println("Yanlış bir ay girdiniz veya harf atası yaptınız.");
                break;
        }

    }
}
