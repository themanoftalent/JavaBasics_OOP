import java.util.Scanner;
public class Ders {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = scan.nextInt();
        int fak = 1;
        for(int i=sayi;1<=sayi;sayi--){
             fak *= sayi;
        }
        System.out.println(fak);
    }
}
