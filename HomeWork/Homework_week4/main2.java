import java.util.Scanner;

public class main2 {
    static Scanner a = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("yasınızı girin:");
        int yas = a.nextInt();

        if (yas >= 0 && yas <= 12) {
            System.out.println("Bu kişi bir çocuktur.");

        } else if (yas >= 13 && yas <= 19) {
            System.out.println("Bu kişi bir ergendir.");

        } else if (yas >= 20 && yas <= 64) {
            System.out.println("Bu kişi bir yetişkindir.");
        } else if (yas >= 65) {
            System.out.println("Bu kişi bir yaşlıdır.");
        } else {
            System.out.println("Geçersiz bir yaş girdiniz.");
        }
    }
}


