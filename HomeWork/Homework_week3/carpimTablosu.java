package ödev8;

import java.util.Scanner;

class carpimTablosu {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("Çarpım tablosunu görmek istediğiniz sayıyı girin:");
        int number = scanner.nextInt();

        System.out.println("***** " + number + " Çarpım Tablosu *****");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
	}

}
//Emiralp Yakalı 2311502251