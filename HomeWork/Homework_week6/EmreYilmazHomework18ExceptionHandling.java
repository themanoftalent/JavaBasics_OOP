import java.util.Scanner;

public class EmreYilmazHomework18ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bölünen sayıyı giriniz: ");
        int bolunen = sc.nextInt();

        System.out.println("Bölen sayıyı giriniz: ");
        int bolen = sc.nextInt();

        while(bolen == 0){
            System.out.println("Hatalı giriş. Lütfen yeni bölen sayı giriniz: ");
            bolen = sc.nextInt();
        }

        System.out.println("Sonuç: "+(float)bolunen/bolen);




    }
}
