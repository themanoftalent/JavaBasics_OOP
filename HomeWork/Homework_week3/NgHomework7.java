import java.util.Scanner;

public class NgHomework7 {
    public static void main(String[] args){
        //klavyeden girilen sayının rakamları toplamı//
        int toplam=0;
System.out.println("bir sayi giriniz:");
        Scanner scanner= new Scanner(System.in);
        int sayi= scanner.nextInt();

        while(sayi>0) {
            int sonBasamak = sayi%10;
            toplam += sonBasamak;
            sayi= sayi/10;
        }
        System.out.println(toplam);

    }
}
