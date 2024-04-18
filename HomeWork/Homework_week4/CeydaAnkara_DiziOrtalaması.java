import java.util.Scanner;
public class DiziOrt {
    public static void main(String[] args) {

        Scanner hafiza= new Scanner(System.in);
        int[] dizi=  new int [10];
        System.out.println("dizi elemanlarını girin");
        int toplam=0;
        for(int i=0;i<dizi.length;i++) {
            dizi[i]= hafiza.nextInt();
            toplam+= dizi[i];
        }
        float ort= toplam/ dizi.length;
        System.out.println(ort);

     //CEYDA ANKARA
    }
}
