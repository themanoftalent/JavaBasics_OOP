import java.util.Scanner;

public class PrintNumberWithForSumeyyeElgin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int sayi;

        do {
            System.out.print("bir sayı girin: ");
            sayi = scan.nextInt();
            if (sayi < 100) {
                System.out.println("girdiğiniz sayı istediğimiz sınırlar içinde değil, sayıyı tekrar girin!!");
            }
        } while (sayi < 100); //küçük oldukça sayıyı tekrar tekrar isteyecek.

        for (int i = sayi; i > 0; i--) {
            System.out.println(i);
        }
    }
}
