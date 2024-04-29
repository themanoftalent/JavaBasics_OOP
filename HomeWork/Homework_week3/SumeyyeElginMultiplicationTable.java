package hafta3;

import java.util.Scanner;

public class SumeyyeElginMultiplicationTable {

    public static void multiplicationTable(int a) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(a + " * " + i + " = " + (i*a));
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("hangi sayının çarpım tablosunu görmek istersiniz? ");
        int a = scan.nextInt();

        multiplicationTable(a);

    }
}
