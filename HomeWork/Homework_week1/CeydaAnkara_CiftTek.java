import java.util.Scanner;

public class CiftTekKontrol {
    public static void main(String[] args) {

        Scanner hafiza=new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi=hafiza.nextInt();
        if(sayi%2==0){
            System.out.println(sayi +" çift sayidir");
        }
        else {
            System.out.println(sayi +" tek sayidir");
        }

    }

}// CEYDA ANKARA
