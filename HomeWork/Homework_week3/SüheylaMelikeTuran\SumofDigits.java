import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SumofDigits {
    public static void main(String[] args) {
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Pozitif bir sayı  giriniz");
        int i=hafıza.nextInt();
        int k=i, toplam=0;
        do {
            int t=k%10;
            toplam+=t;
            k=(k-k%10)/10;
        }
        while (k>0);
        System.out.println("Girilen sayının rakamları toplamı= " +toplam);
    }
}
