import java.util.Scanner;
public class BaranKanat_gerisayma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi = sc.nextInt();
        do {
            if (sayi >=100){
                System.out.println("100 den büyük sayı girdiniz");
                break;
            }
            System.out.println(sayi);
            sayi--;
        } while (sayi >=0);
    }
}
