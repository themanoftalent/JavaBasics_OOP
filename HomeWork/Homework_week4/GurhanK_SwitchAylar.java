import java.util.Scanner;

public class GurhanK_SwitchAylar{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ay;
        int dogruluk = 0;


        do {
            System.out.print("Lutfen sayi seklinde ayi giriniz: ");
            ay = scanner.nextInt();
            if(ay>12){
                System.out.println("Lutfen gecerli bir ay girniz!");
            } else if (ay<1) {
                System.out.println("lutfen geceleri bir ay giriniz!");
            }
            else{
                dogruluk=1;
            }

        }while(dogruluk < 1);


        switch (ay){
            case 1:
                System.out.println("Ocak ayindayiz!");
                break;
            case 2:
                System.out.println("Subat ayindayiz!");
                break;
            case 3:
                System.out.println("Mart ayindayiz!");
                break;
            case 4:
                System.out.println("Nisan ayindayiz!");
                break;
            case 5:
                System.out.println("Mayis ayindayiz!");
                break;
            case 6:
                System.out.println("Haziran ayindayiz!");
                break;
            case 7:
                System.out.println("Temmuz ayindayiz!");
                break;
            case 8:
                System.out.println("Ağustos ayindayiz!");
                break;
            case 9:
                System.out.println("Eylül ayindayiz!");
                break;
            case 10:
                System.out.println("Ekim ayindayiz!");
                break;
            case 11:
                System.out.println("Kasım ayindayiz!");
                break;
            case 12:
                System.out.println("Aralık ayindayiz!");
                break;
        }
    }
}
