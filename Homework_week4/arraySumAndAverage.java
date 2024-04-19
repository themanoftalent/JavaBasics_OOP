/*burcinkutlusan*/
public class arraySumAndAverage {
    public static void main(String[] args) {
        int[] sayilar = {15, 868, 9119, 783};
        int toplam=0;
        double ortalama=0;

        for(int sayi: sayilar) {
            toplam += sayi;
        }
        ortalama= toplam/ sayilar.length;

        System.out.println("Sayılarin toplamı: " +toplam +"\n" +"Sayilarin ortalaması: " +ortalama);
    }
}
