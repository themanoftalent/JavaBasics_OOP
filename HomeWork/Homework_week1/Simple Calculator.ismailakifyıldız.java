import java.util.Scanner;
public class Main9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Basic Calucator");
		
		int x = scanner.nextInt();
		char process = scanner.next().charAt(0);
		int y = scanner.nextInt();
		
		
		switch(process) {
		
		case '+' : System.out.println("="+(x+y));
			break;
		case '-' :System.out.println("="+(x-y));
			break;
		case '*' :System.out.println("="+(x*y));
			break;
		case '/' :if (y == 0) System.out.println(" You can't divide anything to 0");
		else System.out.println("="+(x/y));
			break;
		default: System.out.println("This is just a basic calucator!");
		}
		scanner.close();
	}

}
