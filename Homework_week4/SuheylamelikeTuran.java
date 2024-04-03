import java.util.Scanner;

public class Girilensayıyıgeriyedoğruyazdırma {
    public static void main(String[]args){
        Scanner hafıza=new Scanner(System.in);
        int i;
        do {
            System.out.println("SAYI GİRİNİZ");
            i=hafıza.nextInt();
            if (i<100){
                System.out.println("DAHA BÜYÜK DEĞERLİ");
            }
        }
        while (i<100);
        for (int k=i;i>0;i--)
            System.out.println(i);
    }
}
