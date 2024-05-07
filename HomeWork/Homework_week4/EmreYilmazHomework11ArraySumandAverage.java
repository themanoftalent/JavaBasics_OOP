import java.util.Scanner;

public class EmreYilmazHomework11ArraySumandAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayısını giriniz: ");
        int terim = sc.nextInt();
        int[] dizi = new int[terim];
        int toplam = 0;

        for(int i=0;i<terim;i++){
            System.out.println("Elemanı giriniz: ");
            int eleman = sc.nextInt();
            toplam = toplam + eleman;
        }
        int ortalama = toplam / terim;

        System.out.println("Dizinin elemanları toplamı: "+toplam);
        System.out.println("Dizinin elemanları ortalaması: "+ortalama);

    }
}
