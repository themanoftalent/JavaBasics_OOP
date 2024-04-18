import java.util.Scanner;

public class EmreYilmazHomework6PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int sayi = sc.nextInt();
        int temp = sayi,toplam=0;

        while(temp>0){
            toplam = toplam * 10;
            toplam = toplam + temp % 10;
            temp = temp / 10;
        }
        if(toplam == sayi) System.out.println("Palindrom sayı.");
        else System.out.println("Palindrom sayı değil.");
    }
}
