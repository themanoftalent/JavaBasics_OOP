import java.util.Scanner;
public class Main17 {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		System.out.println("Ay gir: ");
	String ay = scanner.next();
	
	switch(ay) {
	
	case "ocak" :
	case "şubat" :
	case "aralık" :	
		System.out.println("Kış");
		break;
	case "mart" : 
	case "nisan" : 
	case "mayıs" : 
		System.out.println("İlkbahar");
		break;
	case "haziran" : 
	case "temmuz" : 
	case "ağustos" :
		System.out.println("Yaz");
		break;
	case "eylül" : 
	case "ekim" : 
	case "kasım" : 
		System.out.println("Sonbahar");
		break;
	
	default: System.out.println("Fail");
	
	}
	
	}

}
