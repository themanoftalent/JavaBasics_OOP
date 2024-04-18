package ödev16;

import java.util.Scanner;

class armstrongSayi {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı girin:");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(number + " bir Armstrong sayısı değildir.");
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;
        originalNum = num;

        for (originalNum = num; originalNum != 0; originalNum /= 10, ++n);

        originalNum = num;

        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        if (result == num) {
            return true;
        } else {
            return false;
        }

	}

}
//Emiralp Yakalı 2311502251