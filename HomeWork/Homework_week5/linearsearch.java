package linearsearch;
import java.util.Scanner;
public class linearsearch {
	    public static void main(String[]args){

	        int[] dizi={5,7,9,11,23,42,51};

	        Scanner scanner = new Scanner(System.in);
	        System.out.println("İstediğiniz sayıyı giriniz: ");
	        int sayi=scanner.nextInt();
	        boolean bulundu = false;

	        for(int i=0; i<7; i++){
	            if(dizi[i] == sayi){
	                System.out.printf("Dizi[%d] = %d ", i, sayi);
	                bulundu = true;
	                break;
	            }

	            }
	             if (!bulundu) {
	            System.out.println(sayi + " sayısı dizide bulunmamaktadır.");
	        }
	    }

}
