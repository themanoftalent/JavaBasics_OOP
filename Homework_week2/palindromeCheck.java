
public class palindromeCheck {
    /*burcinkutlusan*/
    public static void main(String[] args) {

        System.out.println("Polindrom olan elemanlar:");
        int[] sayilar = {15, 868, 9119, 783};
        for (int i = 0; i<sayilar.length; i++) {
            int a=0 ;
            int palindrom = 0;
            int kalan = 0;
            a = sayilar[i];
            while (a != 0) {
                kalan = a % 10;
                palindrom = palindrom * 10 + kalan;
                a /= 10;

            }
            if (sayilar[i] == palindrom) {
                System.out.println(sayilar[i]);
            }

        }
    }
}