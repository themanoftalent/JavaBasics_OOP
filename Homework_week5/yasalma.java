package yasalma;
import java.util.Scanner;
public class yasalma {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
	        System.out.println("bir yas giriniz:");
	        int yas=scanner.nextInt();

	        if(yas<5){
	            System.out.print("kisi bebektir:");

	        }
	        else if(5<=yas && yas<13){
	            System.out.print("kisi cocuktur:");
	        }
	        else if(13<=yas && yas<20){
	            System.out.print("kisi ergendir:");
	        }
	        else if(20<=yas && yas<50){
	            System.out.print("kisi yetiskindir:");
	        }
	        else{
	            System.out.println("kisi yaslidir:");
	        }
	    }
	}
