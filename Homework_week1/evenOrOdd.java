import java.util.Scanner;

public class evenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        int sayi = input.nextInt();
        if (sayi %2==0) {
            System.out.println(sayi+" bir cift sayidir");
        }
        else{
            System.out.println(sayi+" bir tek sayidir");
        }
        }
}
