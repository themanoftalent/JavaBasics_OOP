public class GurhanK_week5_LinearSearch {

    public static void main(String[] args) {
        // Önceden belirlenmiş bir dizi
        int[] dizi = {1, 2, 3, 4, 5, 6, 7, 8};

        int aranan1 = 4;  // Aranacak 1. değer
        int aranan2 = 10; // Aranacak 2. değer

        boolean bool1 = lineerArama(dizi, aranan1);  //arama işlemleri
        boolean bool2 = lineerArama(dizi, aranan2);

        yazdirma(bool1, aranan1);   //yazdirma işlemleri
        yazdirma(bool2, aranan2);

    }

    // Linear searchten gelen bool değeri için yazdirma
    public  static  void yazdirma(boolean bulundu, int aranan){
        if (bulundu) {
            System.out.println(aranan + " değeri dizide bulunmaktadır.");
        } else {
            System.out.println(aranan + " değeri dizide bulunamamaktadır.");
        }
    }

    // Lineer arama (Linear Search) algoritması
    public static boolean lineerArama(int[] dizi, int aranan) {
        for (int eleman : dizi) {
            if (eleman == aranan) {
                return true; // Aranan eleman dizide bulundu
            }
        }
        return false; // Aranan eleman dizide bulunamadı
    }
}
