import java.util.Scanner;
public class Odev3 {
    public static void main(String[] args) {
        Scanner sayıgir = new Scanner(System.in);
        System.out.println("Kontrol edilecek sayıyı gir");
        int sayi = sayıgir.nextInt();
        if (sayi%2 == 0){
            System.out.println(sayi +"  sayısı çift sayıdır");
        }
        else {
            System.out.println(sayi +"  Sayısı tek sayıdır");
        }
    }
}
