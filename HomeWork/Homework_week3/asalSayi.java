package ödev9;

import java.util.Scanner;

class asalSayi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number = scanner.nextInt();

        boolean isPrime = true;

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (number <= 1) {
            System.out.println(number + " asal değildir ve bileşiktir.");
        } else if (isPrime) {
            System.out.println(number + " asal bir sayıdır.");
        } else {
            System.out.println(number + " asal değildir ve bileşiktir.");
        }

        scanner.close();
	}

}
//Emiralp Yakalı 2311502251