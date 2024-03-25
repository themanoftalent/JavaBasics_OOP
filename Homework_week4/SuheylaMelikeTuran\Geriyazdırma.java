import java.util.Scanner;

public class Girilensayıyıgeriyedoğruyaz {
    public static void main(String[]args){
        Scanner hafıza=new Scanner(System.in);
        int i=hafıza.nextInt();
        do {
            System.out.println("Sayı değeri giriniz.");
            i=hafıza.nextInt();
            if(i<100){
                System.out.println("Daha büyük bir değer giriniz.");
            }
        }
        while (i<100);
        for (int k=i; i>0; i--)
            System.out.println(i);
    }
}
