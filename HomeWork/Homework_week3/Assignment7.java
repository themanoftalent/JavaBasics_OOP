//bekir kaan şahin 2311502223
import java.util.*;
public class Assignment7 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1,a,toplam=0;
        System.out.printf("sayi giriniz:");
        num1 = input.nextInt();
        do{
            a=num1%10;
            num1=(num1-a)/10;
            toplam=toplam+a;




        }while(num1>0);
        System.out.printf("Sonuç:"+toplam);
    }
}