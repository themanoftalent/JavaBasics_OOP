import java.util.Scanner;
/*burcinkutlusan*/
public class carpimtablosu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi = input.nextInt();
        int carpim = 0;
        for (int i = 1; i <= 10; i++) {
            carpim = sayi * i;
            System.out.println(sayi + "*" + i + "=" + carpim);
        }
    }
}
