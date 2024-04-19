//bekir kaan şahin 2311502223
import java.util.Scanner;

public class Assignment4 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1,result=1;
        System.out.printf("sayi giriniz:");
        num1= input.nextInt();
        for(int i=1;i<=num1;i++)
        {
            result=result*i;

        }
        System.out.printf("Sonuç:"+result);
    }
}