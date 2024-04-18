import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Kontrol etmek istediğiniz sayıyı giriniz.");
        int sayı= hafıza.nextInt();
        int t=sayı ,k=sayı;
        int basamak=0;
        while (t!=0){
            t=t/10;
            basamak+=1;
        }
        int toplam=0;
        while (k!=0){
            int m=k%10;
            int üs=1;
            for (int i=1; i<=basamak; i++){
                üs*=m;
                System.out.println(üs);
            }
            toplam+=üs;
            k=(k-k%10)/10;
        }
        System.out.println(toplam);
        if (toplam==sayı){
            System.out.println("Girilen sayı armstrong sayıdır.");
        }
        else {
            System.out.println("Girilen sayı armstrong sayı değildir.");
        }
    }
}
