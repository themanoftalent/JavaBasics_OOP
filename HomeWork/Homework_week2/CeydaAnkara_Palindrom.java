import java.util.Scanner;
public class palindrom {
    public static void main(String[] args) {
        Scanner hafiza= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=hafiza.nextInt();
        int ters=0;
        int temp =sayi;
        while(temp>0){
            int a=temp%10;
            ters+=a;
            ters*=10;
            temp/=10;
        }
        int b=ters/10;
        if(b==sayi){
            System.out.println(sayi+" palindrom sayidir");
        }
        else {
            System.out.println(sayi+ " palindrom sayı değildir");
        }
    }
}//CEYDA ANKARA
