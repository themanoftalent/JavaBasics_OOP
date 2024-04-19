import java.util.Arrays;
import java.util.Scanner;

public class Onur_M_U_Homework12ArraySorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayısını giriniz: ");
        int terim = sc.nextInt();
        int[] dizi = new int[terim];

        for(int i=0;i<terim;i++){
            System.out.println("Dizinin elemanlarını giriniz: ");
            int eleman = sc.nextInt();
            dizi[i] = eleman;
        }
        int buyuk;
        for(int i=0;i<terim;i++){
            for(int j=1;j<terim;j++){
                if(dizi[j]>dizi[j-1]){
                    buyuk = dizi[j];
                    dizi[j] = dizi[j-1];
                    dizi[j-1] = buyuk;

                }
            }
        }
        System.out.println(Arrays.toString(dizi));
    }
}