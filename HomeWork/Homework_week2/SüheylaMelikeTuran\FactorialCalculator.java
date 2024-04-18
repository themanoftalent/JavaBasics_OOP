import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Sayı giriniz.");
        int i=hafıza.nextInt();
        int faktöriyel=1;
        for (int k=i;k>0;k--){
            faktöriyel*=k;
        }
        System.out.println("Girilen sayının faktöriyeli=" +faktöriyel);
    }
}
