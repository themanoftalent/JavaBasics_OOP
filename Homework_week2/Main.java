import java.util.Scanner;
/*BURCİNKUTLUSAN*/
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi= input.nextInt();
        int factoriyel =1;
        int i=1;

        for(i=1;i<=sayi;i++) {
            factoriyel = factoriyel * i;
        }
        System.out.println(sayi+" sayisinin faktoriyeli= "+factoriyel);

    }
}