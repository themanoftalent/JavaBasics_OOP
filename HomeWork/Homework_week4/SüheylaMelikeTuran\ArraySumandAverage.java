public class ArraySumandAverage {
    public static void main(String[] args) {
        int[] dizi={1,2,3,4,5,6,7,8,9,10};
        float toplam=0,ortalama=0;
        for (int i=0; i<dizi.length; i++){
            toplam+=dizi[i];
        }
        ortalama=toplam/ (dizi.length-1);
        System.out.println("Dizinin elemanlarının toplamı=" +toplam);
        System.out.println("Dizinin elemanlarının ortalaması=" +ortalama);
    }
}
