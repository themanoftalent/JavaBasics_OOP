import java.util.Scanner;
public class Main18 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı gir: ");
		int x = scanner.nextInt();
		if (x > 100) System.out.println("Sayı 100'den küçük değil!");
		else {
		
			while(x <= 100) {
				
				System.out.println(x);
				x++;
			}
			
			
		}
	}

}
