import java.util.Scanner;

public class NgHomework4 {
    public static void main(String[] args){
        int faktoriyel=1;

        System.out.println("Bir sayi giriniz:");

        Scanner hesaplayici = new Scanner(System.in);
        int sayi= hesaplayici.nextInt();

        for(int i=1;i<=sayi;i++){
            faktoriyel*=i;
        }
System.out.println(faktoriyel);
    }
}
