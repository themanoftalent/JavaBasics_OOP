import java.util.Scanner;
public class BaranKanat_Aylar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hangi ayda olduğunuzu yazınız");
        String ay = sc.nextLine();
        int flag =0;
        if (ay.equals("Ocak") || ay.equals("Şubat") || ay.equals("Aralık")){
            flag=0;
        } else if (ay.equals("Mart") || ay.equals("Nisan") || ay.equals("Mayıs")) {
            flag=1;

        } else if (ay.equals("Haziran") || ay.equals("Temmuz") || ay.equals("Ağustos")) {
            flag=2;

        } else if (ay.equals("Eylül") || ay.equals("Ekim") || ay.equals("Kasım")) {
            flag=3;
        }
        switch (flag){
            case 0:
                System.out.println("Mevsim Kış");
                break;
            case 1:
                System.out.println("Mevsim İlkbahar");
                break;
            case 2:
                System.out.println("Mevsim yaz");
                break;
            case 3:
                System.out.println("Mevsim Sonbahar");
                break;
            default:
                System.out.println("Başka Gezegende yaşıyon");
                break;
        }
    }
}
