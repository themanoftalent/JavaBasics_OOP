import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        switch(yas){
            case 0:
                System.out.println("Yeni Doğdun!");
            break;

            case 1:
                System.out.println("Bir Yaşındasın!");
            break;

            case 5:
                System.out.println("Beş Yaşındasın!");
            break;

            case 10:
                System.out.println("On yaşındasın. Okula başladın!");
            break;

            case 15:
                System.out.println("On beş yaşındasın. Liselisin!");
            break;

            case 20:
                System.out.println("Yirmi yaşındasın. Üniversiteye başladın!");
            break;

            default:
                System.out.println("Farklı bir yaş gir!");
        }
    }
}
