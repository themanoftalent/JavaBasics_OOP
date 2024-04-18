import java.util.Scanner;
public class asalsayı {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi;
        System.out.println("bir sayi giriniz:");
        sayi=scan.nextInt();
        int sayac=0;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                sayac++;
                break;
            }


            }
        if(sayac==0){
            System.out.println("asal sayidir.");
        }
        else{
            System.out.println("asal sayi degildir.");
        }


        }
}
