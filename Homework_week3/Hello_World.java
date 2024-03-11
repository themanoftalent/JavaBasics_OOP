
import java.util.Scanner;

public class Hello_World {

	public static void main(String[] args) {
		Scanner girdi_sayisi= new Scanner(System.in);
		System.out.println("enter first number");
		float sayi1= girdi_sayisi.nextFloat();
		
		System.out.println("enter second number");
		int sayi2= girdi_sayisi.nextInt();
		float toplam= sayi1+sayi2;
		System.out.println("toplam; "+toplam);
			

	}

}