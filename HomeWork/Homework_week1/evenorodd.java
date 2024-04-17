package evenorodd;
import java.util.Scanner;
public class evenorodd {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	    System.out.println("bir sayi giriniz");
	  int sayi  = scanner.nextInt();
	  if (sayi % 2 == 0){
	      System.out.println(sayi + " bir cift sayidir.");
	  }
	  else  {
	      System.out.println(sayi + " bir tek sayidir.");
	  }
	}
	}

