package reverseastring;
import java.util.Scanner;
public class reverseastring {
			public static void main(String[] args) {

				Scanner scanner = new Scanner(System.in);
				String duz = scanner.nextLine();
				int uzunluk = duz.length();
				String ters = "";

				for (int i = uzunluk - 1; i >= 0; i--) {
					ters += duz.charAt(i);

				}

				for (int i = 0; i < uzunluk; i++) {
					System.out.println(ters.charAt(i));

				}
				scanner.close();
			}
		}
