import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner hafiza= new Scanner(System.in);
        System.out.println("3 basamaklı sayı giriniz");
        int sayi= hafiza.nextInt();
        int temp= sayi;
        int toplam=0;

        while(temp>0){
            int a=temp%10;
            toplam+= a*a*a;
            temp=temp/10;
        }
        if(toplam== sayi) {
            System.out.println("armstrong sayidir");
        }
        else {
            System.out.println("armstrong sayi değildir");
        }
    }
}//CEYDA ANKARA
