package palindrom;
import java.util.Scanner;
public class palindrom {
	    public static void main(String[] args) {
	        Scanner scan=new Scanner(System.in);
	        int sayi;
	        System.out.println("Bir sayi giriniz:");
	        sayi=scan.nextInt();
	        int sayix=sayi ,toplam=0;

	        while(sayix>0){
	            toplam=toplam*10;
	            toplam=toplam+(sayix%10);
	            sayix=sayix/10;
	        }
	        if(sayi==toplam){
	            System.out.println("Palindromdur");

	        }
	        else{
	            System.out.println("Palindrom degildir");
	        }
	    }
	}

