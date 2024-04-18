import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int d=1;
        System.out.println("diziniz kaç karakterden oluşacak");
        int adet=input.nextInt();
        int[] Sayilar=new int[adet];
        for(int a=0;a<adet;a++) {
            int e=d+a;
            System.out.println("diziniziniz "+e+".terimini giriniz");
            Sayilar[a] = input.nextInt();
        }

        System.out.print("diziniz = ");
        for(int b=0;b<adet;b++){
            System.out.print(Sayilar[b]+" ");

        }
        System.out.println();
        System.out.print("dizininiz tersi = ");
        for(int i=adet-1;i>=0;i--){
            System.out.print(Sayilar[i]+" ");
        }

    }
}