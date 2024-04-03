import java.util.Scanner;

public class Yaş {
    public static void main(String[]args){
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Yaş giriniz.");
        int yaş=hafıza.nextInt();
        switch (yaş){
            case 0:
                System.out.println("Yeni doğan.");
                break;
            case 1:
                System.out.println("Bir yaşında.");
                break;
            case 5:
                System.out.println("Beş yaşında.");
                break;
            case 10:
                System.out.println("Okula başlama");
                break;
            case 15:
                System.out.println("Liseli");
                break;
            case 20:
                System.out.println("Üniversite başlama");
                break;
            default:
                System.out.println("Yaşlılık");
        }
    }
}
