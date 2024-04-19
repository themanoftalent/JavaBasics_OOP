package ödev7;

import java.util.Scanner;

class rakamTopla {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Pozitif bir tamsayı girin:");
		int number = scanner.nextInt();

		int sum = 0;

		int tempNumber = number;
		while (tempNumber != 0) {
			int digit = tempNumber % 10;
			sum += digit;
			tempNumber /= 10;
		}

		System.out.println("Girilen sayının rakamlarının toplamı: " + sum);

		scanner.close();
	}

}
//Emiralp Yakalı 2311502251