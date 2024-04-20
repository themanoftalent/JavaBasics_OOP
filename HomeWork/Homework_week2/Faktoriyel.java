package ödev4;

import java.util.Scanner;

class faktoriyel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Faktöriyelini hesaplamak istediğiniz sayıyı girin:");
        int number = scanner.nextInt();

        int factorial = 1;

        // 1'den başlayarak girilen sayıya kadar olan tüm sayıları çarparak faktöriyeli hesapla
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println(number + " sayısının faktöriyeli: " + factorial);

        scanner.close();

	}

}
//Emiralp Yakalı 2311502251