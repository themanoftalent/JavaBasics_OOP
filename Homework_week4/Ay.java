import java.util.Scanner;

public class Ay {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ayı giriniz: ");
		String mevsim= scanner.nextLine();
		  
	    String kullaniciTuru; 
	    
	    switch (mevsim) {
	    
	    case "aralık":
        case "ocak":
        case "şubat":
            mevsim = "Kış";
            break;
        case "mart":
        case "nisan":
        case "mayıs":
            mevsim = "İlkbahar";
            break;
        case "haziran":
        case "temmuz":
        case "ağustos":
            mevsim = "Yaz";
            break;
        case "eylül":
        case "ekim":
        case "kasım":
            mevsim = "Sonbahar";
            break;
        default:
            mevsim = "Geçersiz ay!";
            break;
    }

    System.out.println("Girilen ayın mevsimi: " + mevsim);
    
    //Ali Eren Hakut Hafta 4
	    }

	}


