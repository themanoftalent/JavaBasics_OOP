/*burcinkutlusan*/
public class linearSearch {
    public static void main(String[] args) {
        int[] dizi={10 , 20, 30, 40, 50, 60, 70};
        int aranan= 30;
        int indeks = arama(dizi, aranan);

        if (indeks != -1) {
            System.out.println("Öğe dizide bulundu, indeksi: " + indeks);
        } else {
            System.out.println("Öğe dizide bulunamadı.");
        }
        }
    public static int arama(int[] dizi, int aranan) {
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                return i;
            }
        }
        return -1;
    }
}