import java.util.Scanner;
public class Main16 {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Yaş: ");
		int yas = scanner.nextInt();
		
		scanner.close();
	
		switch(yas) {
		
		case 0 : System.out.println("Bebek");
		break;
		case 5 : System.out.println("Anaokulu");
		break;
		case 10 : System.out.println("Ortaokul");
		break;
		case 15 : System.out.println("Lise");
		break;
		case 20 : System.out.println("Üniversite");
		break;
		case 30 : System.out.println("İş");
		break;
		case 40 : System.out.println("Emekli");
		break;
		default: System.out.println("Yaşlı");
		
		}
	}

}
