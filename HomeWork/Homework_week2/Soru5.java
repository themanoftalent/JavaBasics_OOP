import java.awt.FocusTraversalPolicy;
import java.util.Iterator;
import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;

public class Soru5 {

	public static void main(String[] args) {
    //Generate the Fibonacci sequence up to a specified number of terms.
     System.out.println("Fibonacci dizisinin kaç elemanını istiyorsunuz? ");
     Scanner scanner = new Scanner(System.in);
     int elemanSayi =scanner.nextInt();  
     int[] fib = new int[elemanSayi];
     fib[0]= 1; 
     fib[1]= 1;
     for (int a =2; a != elemanSayi ; a++) 
     {
		fib[a] = fib[a-1] + fib[a-2]; 
	 }
     System.out.println("Fibonacci dizisinin elemanları.. ");
     for(int a = 0 ; a < elemanSayi  ; a++ )
     {  
    	 if(a==0) {System.out.print(fib[a]);}
    	 else System.out.print(", "+ fib[a]);
     }
     
	}

}
