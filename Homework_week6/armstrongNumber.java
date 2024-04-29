import java.util.Scanner;
/*burcinkutlusan*/

public class armstrongNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi= input.nextInt();
        if (armstrong(sayi)) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }
    }
    public static boolean armstrong(int sayi) {
        int basamakSayisi = String.valueOf(sayi).length();
        int gecici = sayi;
        int toplam = 0;

        while (gecici > 0) {
            int basamak = gecici % 10;
            toplam += Math.pow(basamak, basamakSayisi);
            gecici /= 10;
        }

        return toplam == sayi;
    }

}
