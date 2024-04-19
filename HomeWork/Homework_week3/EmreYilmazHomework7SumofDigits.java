import java.util.Scanner;

public class EmreYilmazHomework7SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = sc.nextInt();
        int toplam = 0;

        if(number >= 0){
            while(number>0){
                toplam = toplam + number % 10;
                number = number / 10;
            }
            System.out.println("Rakamları toplamı: "+toplam);
        }

        else System.out.println("Pozitif bir sayı girmediniz.");
    }
}

