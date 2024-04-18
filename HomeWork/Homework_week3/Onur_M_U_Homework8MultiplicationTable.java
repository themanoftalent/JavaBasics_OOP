import java.util.Scanner;
public class Onur_M_U_Homework8MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çarpım tablosunu görmek istediğiniz sayıyı girin: ");
        int sayi = scanner.nextInt();

        System.out.println("----- " + sayi + " Çarpım Tablosu -----");
        for (int i = 1; i <= 10; i++) {
            System.out.println(sayi + " * " + i + " = " + (sayi * i));
        }

        scanner.close();
        }
    }
