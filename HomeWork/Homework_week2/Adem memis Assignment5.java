import java.util.Scanner;
public class Ders {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int sayi1=0;
        int sayi2=1;
        int toplam;
        System.out.println("Bir sayi giriniz");
        int dongu = scan.nextInt();
        for(int i =1;i<=dongu;i++){
            System.out.print(sayi1+", ");
            toplam=sayi1+sayi2;
            sayi1=sayi2;
            sayi2=toplam;

        }

    }
