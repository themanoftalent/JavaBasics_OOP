import java.util.*;

public class GpaSwitchCaseSumeyyeElgin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("(1-5 arası giriniz) not1: ");
        int not1 = scan.nextInt();

        System.out.print("(1-5 arası giriniz) not2: ");
        int not2 = scan.nextInt();

        System.out.print("(1-5 arası giriniz) not3: ");
        int not3 = scan.nextInt();

        System.out.print("(1-5 arası giriniz) not4: ");
        int not4 = scan.nextInt();

        System.out.print("(1-5 arası giriniz) not5: ");
        int not5 = scan.nextInt();

        int gpa = (not1 + not2 + not3 + not4 + not5) / 5;

       switch (gpa) {
           case 1, 2:
               System.out.println("ortalamanız: " + gpa + ", kaldınız");
               break;
           case 3:
               System.out.println("ortalamanız: " + gpa + ", sorumlu geçtiniz");
               break;
           case 4, 5:
               System.out.println("ortalamanız: " + gpa + ", geçtiniz");
               break;
           default:
               System.out.println("geçersiz not girdiniz");
       }

    }
}
