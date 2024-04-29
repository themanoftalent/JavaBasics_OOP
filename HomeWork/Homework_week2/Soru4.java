import java.awt.FocusTraversalPolicy;
import java.util.Scanner;

public class Soru4 {

	public static void main(String[] args) {
         //Calculate the factorial of a number using loops.
         System.out.println("Lütfen faktöriyelinin hesaplanmasını istediğinin numarayı giriniz:");
         int sayi; 
         int sonuc = 1 ; 
         Scanner scanner = new Scanner(System.in); 
         sayi = scanner.nextInt(); 
      
         for(int a = sayi ; a>0 ; a-- ) 
         {
            sonuc *= a ;
         }
         System.out.println("Girilen sayının faktöriyeli: " +sonuc); 
		
	}

}
