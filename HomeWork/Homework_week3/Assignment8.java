//bekir kaan şahin 2311502223
import java.util.*;
public class Assignment8 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int num1, num2;
        System.out.printf("sayi giriniz:");
        num1 = input.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.printf(num1 + " * " + i + " = " + (num1 * i));
            System.out.printf("\n");

        }
    }
}