import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment8 {

    // Girilen sayının 1-10 arası çarpımlarının tablosunu verir
    static void PrintMulTable(int in){
        for (int i = 1; i < 10; i++){
            System.out.println(i + " x " + in + " = " + i*in);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir Sayı Giriniz");
        PrintMulTable(sc.nextInt());

    }
}
