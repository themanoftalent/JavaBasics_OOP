import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        int carpim;
        System.out.println("sayi giriniz:");
        sayi=scan.nextInt();
        for(int i=1;i<=9;i++){
            carpim=i*sayi;
            System.out.println(carpim);
        }

    }
}
