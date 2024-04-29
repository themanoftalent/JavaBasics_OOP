import java.util.Scanner;
/*burcinkutlusan*/
public class primeNumberChecker {
    public static boolean asalKontrol(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i < sayi/2; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int sayi = input.nextInt();
        if (asalKontrol(sayi)) {
            System.out.println("asaldır");
        } else {
            System.out.println("asal degildir");
        }
    }
}
