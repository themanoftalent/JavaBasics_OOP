//bekir kaan şahin 2311502223
import java.util.*;
public class Assignment9 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1;
        System.out.print("Sayi Giriniz:");
        num1 = input.nextInt();
        for(int i=2;i<num1;i++){

            if(num1%i==0)
            {
                System.out.print("asal sayi değil");
                return ;
            }

        }
        System.out.print("asal sayi ");
    }
}