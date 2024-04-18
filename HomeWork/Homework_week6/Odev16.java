import java.util.Scanner;
public class Odev16 {
    public static void main(String[] args) {
        Scanner getsayi = new Scanner(System.in);
        System.out.println("Armstrong sayi kontrolü için sayı gir");
        int sayi = getsayi.nextInt();
        String sayininstringi = String.valueOf(sayi);
        int sayiniuzunlugu = sayininstringi.length();
        int toplam = 0;
        int temp = sayi;
        for (int i =0;i<sayiniuzunlugu;i++){
            toplam += Math.pow((sayi%10),sayiniuzunlugu) ;

            sayi  =sayi/10;
        }
        if (temp == toplam){
            System.out.println("Bu sayı armstrong sayısıdır");
        }
        else{
            System.out.println("Bu sayı armstrong sayısı değil");
        }

    }
}
