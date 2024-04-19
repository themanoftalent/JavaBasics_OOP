package hafta2;

import java.util.Scanner;

public class SumeyyeElginFactorialCalculator {

    public static int factorial(int f) {
        if (f <= 1) {
            return 1; //sonunda f = 1 olduğunda return vererek sonuca ulaşacağız
        } else {
            return f * factorial((f - 1)); //burada sayıyı metod içerisinde birer birer azaltarak kendisiyle çarptık
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("lütfen faktöriyeli hesaplanacak sayıyı giriniz: ");
        int f = input.nextInt();

        System.out.println("işleminizin sonucu: " + factorial(f));
    }
}
