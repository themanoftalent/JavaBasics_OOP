import java.util.Scanner;

public class GurhanK_week3_PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;

        System.out.print("Asallığı bulmak için bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        if(sayi<2){
            System.out.println("2 den küçük tam sayılar asal değildir");
        }
        else{
            for (int i = 2; i<sayi; i++){
                if (sayi%i==0){
                    counter++;
                }
            }
        }

        if (counter>0){
            System.out.println(sayi + " sayisi asal değildir");
        }
        else{
            System.out.println(sayi + " sayisi asldır");
        }
    }
}
