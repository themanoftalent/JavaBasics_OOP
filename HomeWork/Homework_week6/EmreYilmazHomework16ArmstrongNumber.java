import java.util.Scanner;

public class EmreYilmazHomework16ArmstrongNumber {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz: ");
        int number = sc.nextInt();

        int temp = number;
        int basamaksayisi = 0;
        while(temp > 0){
            temp = temp / 10;
            basamaksayisi++;
        }
        int temp2 = number;
        while(temp2 > 0){
            int üs = 1;
            for(int j = 0;j < basamaksayisi;j++){
                üs = üs * (temp2 % 10);
            }
            toplam = toplam + üs;
            temp2 = temp2 / 10;
        }
        if(number == toplam){
            System.out.println("Amstrog sayıdır");
        }
        else{
            System.out.println("Amstrog sayı değildir");
        }
    }
}
