package hafta6;

import java.util.Scanner;

public class SumeyyeElginExceptionHandling {
    public static void arithmeticExceptionHandle(int n1, int n2, String islem) {
        if (islem.equals("/")) {
            if (n2 == 0) {
                System.out.println("hiç bir sayı sıfıra bölünemez. tekrar deneyiniz.");
            } else {
                System.out.println("işlem sonucu: " + ((double) n1 / n2));
            }
        } else if (islem.equals("*")) {
            System.out.println("işlem sonucu: " + ( n1 * n2));
        } else if (islem.equals("+")) {
            System.out.println("işlem sonucu: " + ( n1 + n2));
        } else if (islem.equals("-")) {
            System.out.println("işlem sonucu: " + ( n1 - n2));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("birinci sayıyı girin: ");
        int n1 = scan.nextInt();

        scan.nextLine(); //kullanıcından int değer aldıktan hemen sonra string değer alırsak sonraki adıma atlıyor. bu sorunu çözmek için kullandım

        System.out.print("işlem seçiniz (+, -, *, /): ");
        String islem = scan.nextLine();

        System.out.print("ikinci sayıyı girin: ");
        int n2 = scan.nextInt();

        arithmeticExceptionHandle(n1, n2, islem);

    }
}
