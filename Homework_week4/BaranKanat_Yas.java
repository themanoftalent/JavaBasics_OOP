import java.util.Scanner;
public class BaranKanat_Yas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı Giriniz");
        int yaş = sc.nextInt();

        switch (yaş){
            case 0:
                System.out.println("Yeni Doğmuş");
                break;
            case 1:
                System.out.println("Bir Yaşında");
                break;
            case 5:
                System.out.println("5 yaşında");
                break;
            case 10:
                System.out.println("Okula başlıyo");
                break;
            case 15:
                System.out.println("Artık liseli");
                break;
            case 20:
                System.out.println("Üniye başlamş");
                break;

            default:
                System.out.println("Hayat bitti");
                break;
        }
    }
}
