import java.nio.channels.InterruptedByTimeoutException;
import java.util.Scanner;

public class Soru3 {

	public static void main(String[] args) {
            //Determine whether a number entered by the user is even or odd.
		    System.out.println("Lütfen bir sayı giriniz:10");
            Scanner scanner = new Scanner(System.in);
            int input = scanner.nextInt(); 
            int sonuc = input%2;
            if(sonuc == 0) {
            	System.out.println("Girdiğiniz sayı çifttir");		
            }
            else if(sonuc == 1) {
            	System.out.println("Girdiğiniz sayı tektir");	
            }
            
        

	}

}
