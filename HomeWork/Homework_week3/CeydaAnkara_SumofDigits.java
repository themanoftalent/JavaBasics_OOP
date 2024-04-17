import java.util.Scanner;
public class sumofdigits {
    public static void main(String[] args) {
        Scanner hafiza= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi= hafiza.nextInt();
        int toplam=0;
        int temp=sayi;
        while(temp>0){
            toplam +=temp%10;
            temp/=10;
        }
        System.out.println(sayi+" sayısının rakamları toplamı:"+toplam);
    }
}//CEYDA ANKARA
