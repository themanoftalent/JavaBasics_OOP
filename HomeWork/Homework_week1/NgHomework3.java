import java.util.Scanner;

public class NgHomework3 {
    public static void main(String[] args){
        System.out.println("bir sayi giriniz:");
        Scanner scanner= new Scanner(System.in);
        int sayi= scanner.nextInt();

        if(sayi%2 == 0) {
            System.out.println("Sayınız çifttir.");

        } else {
            System.out.println("sayınız tektir.");
        }
    }
}
