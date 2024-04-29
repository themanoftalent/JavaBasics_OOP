/*burcin kutlusan*/
public class Main {
    public static void main(String[] args) {
        int[] sayilar={55, 49, 50, 40, 5};
        yazdir(sayilar);
        System.out.println("dizisinin siralanmis hali");
        sirala(sayilar);
       yazdir(sayilar);
    }
    public static void sirala(int[] dizi) {
        for (int i = 0; i < dizi.length - 1; i++) {
            for (int j = 0; j <dizi.length - 1; j++) {
                if (dizi[j] > dizi[j+1]) {
                    int a = dizi[j+1];
                    dizi[j+1] = dizi[j];
                    dizi[j] = a;
                }
            }
        }
    }
    public static void yazdir(int[] dizi){
        for(int i=0; i<dizi.length ;i++){
            System.out.print(dizi[i]+" ");
        }
    }
}
/*hata1:[] sembolünü yanlis yere koymusum
hat2: int yazmayi unutmusum
hata3:length kelimesini yanlis yazmisim
+dizinin en son halini yazdirmamisim
 */
