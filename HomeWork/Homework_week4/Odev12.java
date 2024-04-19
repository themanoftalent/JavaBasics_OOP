import java.util.Scanner;
public class Odev12 {
    public static void main(String[] args) {
        System.out.println("Dizinin uzunluğunu giriniz");
        Scanner getsayi = new Scanner(System.in);
        int uzunluk = getsayi.nextInt();
        int[] sayidizisi = new int[uzunluk];
        for (int i = 0 ;i<uzunluk;i++){
            System.out.println("Dizinin "+(i+1)+".ci elemanını gir" );
            sayidizisi[i] = getsayi.nextInt();
        }
        System.out.println("Dizinin ilk hali =");
        for (int i = 0 ;i < uzunluk;i++){
            System.out.print(sayidizisi[i]+ "  ");
        }
        System.out.println("\n");
        System.out.println("Ve dizinin sıralanmış hali");
        for (int i =0; i < uzunluk; i++){
            int min = sayidizisi[i];
            for (int j = 0; j < uzunluk;j++){
                if (sayidizisi[j]>min){
                    int temp = sayidizisi[i];
                    sayidizisi[i] = sayidizisi[j];
                    sayidizisi[j] = temp;
                }

            }
        }
        for (int i = 0;i<uzunluk;i++){
            System.out.print(sayidizisi[i] + "  ");
        }
    }
}
