//bekir kaan şahin 2311502223
import java.util.*;
public class Assignment5 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int a=1,b=1,c;
        System.out.printf("sayi giriniz");
        int num1;
        num1 = input.nextInt();
        System.out.printf(""+a );
        System.out.printf(" "+b);
        for (int i=1;i<=num1-2;i++)
        {
            c=a+b;
            System.out.printf(" "+c);
            a=b;
            b=c;
        }

    }
}