package mevsim;
import java.util.Scanner;

public class mevsimbul {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
        System.out.println("kacinci ay?:");
    int ay = scanner.nextInt();



        switch (ay) {
            case 1:
            case 2:
                System.out.println("Kış mevsimi");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İlkbahar mevsimi");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Yaz mevsimi");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Sonbahar mevsimi");
                break;
            case 12:
                System.out.println("Kış mevsimi");
                break;
            default:
                System.out.println("Girdiğiniz ay geçersiz.");
        }
    }
    }
