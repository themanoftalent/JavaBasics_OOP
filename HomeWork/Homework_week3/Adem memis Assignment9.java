import java.util.Scanner;
public class Ders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = scan.nextInt();
        boolean sayiasalmi = true;
        int i;

        for(i = 2; i<sayi/2; i++){
            if(sayi % i == 0){
                sayiasalmi = false;
                break;
            }
        }
        if(sayiasalmi){
            System.out.println("Asal sayi");
        }
        else{
            System.out.println("Asal sayi değil");
        }
    }
}
