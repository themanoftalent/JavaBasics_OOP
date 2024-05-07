import java.util.Scanner;

public class GurhanK_week1_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();

        if(sayi%2==0){
            System.out.println(sayi + " çift bir sayidir.");
        }
        else{
            System.out.println(sayi + " tek bir sayidir.");
        }


    }
}
