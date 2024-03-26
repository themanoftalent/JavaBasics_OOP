import java.util.*;

public class AgeSwitchCaseSumeyyeElgin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("yaşınızı giriniz: ");
        int age = input.nextInt();

        int birthYear = 2024 - age;

        System.out.println("doğum yılınız: " + birthYear);

        switch (age) {
            case 0:
                System.out.println("yeni doğdun");
                break;
            case 1:
                System.out.println("bir yaşındasın");
                break;
            case 5:
                System.out.println("5 yaşındasın");
                break;
            case 10:
                System.out.println("okula gidiyorsun");
                break;
            case 15:
                System.out.println("liselisin");
                break;
            case 20:
                System.out.println("üniversiteye gidiyorsun");
                break;
            default:
                System.out.println("yaşlısın");
        }

    }
}
