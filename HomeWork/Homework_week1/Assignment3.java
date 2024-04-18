//bekir kaan şahin 2311502223
import java.util.*;
public class Assignment3 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1;
        System.out.printf("sayiyi giriniz:");
        num1 =input.nextInt();

        if(num1%2==0){
            System.out.printf("sayi cift");
        }
        else
            System.out.printf("sayi tek");
    }
}