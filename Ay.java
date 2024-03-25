
import java.util.Scanner;
public class Ay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir ay giriniz.");
        String ay = sc.nextLine();

        switch(ay){
            case ("Ocak"):
                System.out.println("1. ay.");
                break;
            case ("Şubat"):
                System.out.println("2. ay.");
                break;
            case ("Mart"):
                System.out.println("2. ay.");
                break;
            case ("Nisan"):
                System.out.println("1. ay.");
                break;
            case ("Mayıs"):
                System.out.println("2. ay.");
                break;
            case ("Haziran"):
                System.out.println("1. ay.");
                break;
            case ("Temmuz"):
                System.out.println("2. ay.");
                break;
            case ("Ağustos"):
                System.out.println("1. ay.");
                break;
            case ("Eylül"):
                System.out.println("2. ay.");
                break;
            case ("Ekim"):
                System.out.println("2. ay.");
                break;
            case ("Kasım"):
                System.out.println("1. ay.");
                break;
            case ("Aralık"):
                System.out.println("2. ay.");
                break;
            default:
                System.out.println("Yanlış bir ay girdiniz veya harf atası yaptınız.");
                break;
        }

    }
}
