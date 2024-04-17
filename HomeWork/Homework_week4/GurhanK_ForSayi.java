// Gurhan Kaya Girilen Sayidan sıfıra doğru geri saydırma

import java.util.Scanner;

public class GurhanK_ForSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geriye dogru sayma programi !");

        int sayi;

        do {
            System.out.print("Lutfen Baslangic sayisini giriniz: ");
            sayi = scanner.nextInt();
            if (sayi<100){
                System.out.println("Lutfen 100 den büyük bir sayi giriniz!");
            }

        }while(sayi<100);

        for(int i=sayi; i>0; i--){
            System.out.print(i+" ");
            if (i%10==0){
                System.out.println("\n");
            }
        }
    }
}
