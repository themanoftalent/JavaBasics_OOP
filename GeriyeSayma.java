
import java.util.Scanner;
public class GeriyeSayma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();

        if(sayi<=100) {
            for(int i = sayi;0<=sayi;sayi--){
                System.out.print(sayi + " ");
            }
        }
        else{
            System.out.println("hatalı sayı girdiniz.");
        }

    }
}
