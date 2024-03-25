
import java.util.Scanner;

public class Hello_World{
	public static void main(String []args) {
		java.util.Scanner yenihafiza= new Scanner(System.in);
		System.out.println("enter your name \n");
		String isim= yenihafiza.nextLine();
		
		System.out.println("enter your surname\n");
		String soyisim= yenihafiza.nextLine();
		System.out.println("your name and surname :"+ isim +" " + soyisim);
		
	}
	
	
}