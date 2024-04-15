import java.util.*;
public class Yas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Doğum tarihinizi giriniz:");
        int dt = sc.nextInt();

        int yas = 2024 - dt;

        switch(yas){

            case 0:
                System.out.println("yeni doğdun.");
                break;
            case 1:
                System.out.println("bir yaşındasın.");
                break;
            case 5:
                System.out.println("5 yaşıdasın");
                break;
            case 10:
                System.out.println("okula başladın.");
                break;
            case 15:
                System.out.println("lisedesin.");
                break;
            case 20:
                System.out.println("üniversitedesin.");
                break;
            default:
                System.out.println("yaşlısın.");
                break;
        }

    }
}
