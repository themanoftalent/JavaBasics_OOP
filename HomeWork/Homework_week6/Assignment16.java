//Bekir kaan şahin 2311502223
import java.util.*;
public class Assignment16 {

    public static boolean Armstrong(int number) {
        int num1, kalan, sonuc = 0, n = 0;


        num1 = number;


        while (num1 != 0) {
            num1 /= 10;
            ++n;
        }


        num1 = number;


        while (num1 != 0) {
            kalan = num1 % 10;
            sonuc += Math.pow(kalan, n);
            num1 /= 10;
        }


        if (sonuc == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Sayi giriniz: ");
        int number = scanner.nextInt();


        if (Armstrong(number)) {
            System.out.println(number + " Armstrong sayisidir.");
        } else {
            System.out.println(number + " Armstrong sayisi değildir.");
        }

        scanner.close();
    }
}