import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("fibonnaci dizisinin kaç terimini bulmak istiyorsunuz");
        int terimSayisi=input.nextInt();
        int[] fibonnaciDizisi = new int[terimSayisi];
        int ilk=1;
        int ikinci=2;
        fibonnaciDizisi[0]=ilk;
        fibonnaciDizisi[1]=ikinci;
        for(int b=2;b<terimSayisi;b++){
          if(b%2==0) {
              ilk = ilk + ikinci;
              fibonnaciDizisi[b] = ilk;
          }else {
              ikinci = ilk + ikinci;
              fibonnaciDizisi[b ] = ikinci;
          }
        }
        for(int c=0;c<terimSayisi;c++){
            System.out.println(fibonnaciDizisi[c]);

        }
    }
}