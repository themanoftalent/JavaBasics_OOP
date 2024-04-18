import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz sayıyı giriniz.");
        int i=hafıza.nextInt();
        int k=i, t=0;
        do {
            int m=k%10;
            t= t*10+m;
            k=(k-k%10)/10;
        }
        while (k>0);
        if (t==i){
            System.out.println("Girdiğiniz sayı polindrom sayıdır.");
        }
        else {
            System.out.println("Girdiğiniz sayı polindrom sayı değildir.");
        }
    }
}
