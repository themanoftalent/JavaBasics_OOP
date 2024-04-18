import java.util.Scanner;
public class Odev4 {
    public static void main(String[] args) {
        int faktori = 1;
        Scanner fk = new Scanner(System.in);
        System.out.println("Faktöriyeli alınacak sayı = ?");
        int sayi= fk.nextInt();
        for (int i = sayi;i>1;i--){
            faktori = faktori * i;

        }
        System.out.println(sayi + " Sayısının faktöriyeli = " + faktori);
    }
}
