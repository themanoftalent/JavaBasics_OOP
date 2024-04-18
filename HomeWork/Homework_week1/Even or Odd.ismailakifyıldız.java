import java.util.Scanner;
public class Main10 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Tek mi, Cift mi?");
	System.out.println("Sayı gir: ");
	double x = scanner.nextDouble();
	
	if ((x%1) == 0) {
	 if ((x == 0) || (x%2 == 0)) {
		System.out.println("Girilen sayı çifttir.");
	 }
	 else  {System.out.println("Girilen sayı tektir.");
	 }
	} else System.out.println("Tam sayı giriniz!");
	

	
	scanner.close();
	}

}
