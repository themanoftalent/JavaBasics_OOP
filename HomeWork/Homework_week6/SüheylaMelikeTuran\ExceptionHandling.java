import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Bölme işlemi yapamak için sayı değerleri giriniz.");
        int i= hafıza.nextInt();
        int k= hafıza.nextInt();
        if (k==0){
            System.out.println("Payda sıfır olamaz.");
        }
        else {
            int bölüm=i/k;
            System.out.println(i +"/" +k +"=" +bölüm);
        }
    }
}
