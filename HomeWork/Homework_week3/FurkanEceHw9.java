import java.util.Scanner;

public class FurkanEceHw9 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean isPrime = true;
        System.out.println("Asal sayiligi kontrol edilecek olan sayiyi giriniz");
        int number = in.nextInt();

        for(int i = 2; i < (number); i++){
            if(number%i == 0){
                isPrime = false;
                break;
            }

        }
        if(isPrime == true){
            System.out.println("Sayi bir asal sayidir");
        }
        else
        System.out.println("Bu sayi bir asal sayi degildir");
    }
}