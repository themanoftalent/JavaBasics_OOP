import java.util.Scanner;
public class Odev5 {
    public static void main(String[] args) {
        Scanner getsayi = new Scanner(System.in);
        System.out.println("Kaçıncı terime kadar fibo terimi gösterilecek.lütfen belirtiniz");
        int kacakadar = getsayi.nextInt(); // kaçıncı fibo terimine kadar gideceğini belirle
        System.out.println("İlk " + kacakadar + "fibonacci terimi =" );
        int a ,b;
        a = 0;
        b= 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0 ; i<kacakadar-2;i++){
            int temp; // a ve b arasında sayı aktarımı olurken sayıların kaybolmamasını sağlıyoruz
            temp = b;
            b += a;
            a = temp;
            System.out.println(b);


        }
    }
}
