import java.util.Scanner;
public class Ders {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = scan.nextInt();
        if(sayi%2==0){
            System.out.println("sayi cift");
        }
        else{
            System.out.println("sayi tek");
        }
    }
}
