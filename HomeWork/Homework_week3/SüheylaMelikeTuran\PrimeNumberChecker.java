import java.util.Scanner;

public class PrimeNumberChecker {
    public static void main(String[] args) {
        System.out.println("Sayı giriniz.");
        Scanner hafıza= new Scanner(System.in);
        int i= hafıza.nextInt();
        if (i==1){
            System.out.println("Girilen sayı asal değildir.");
        }
        else{
            for (int k=i/2; k>1; k--){
                if (i%k==0){
                    System.out.println("Girilen sayı asal değildir.");
                    break;
                }
            }
            System.out.println("Girilrn sayı asaldır.");
        }
    }
}
