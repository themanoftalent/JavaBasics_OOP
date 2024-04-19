package ödev5;

import java.util.Scanner;

class fibonacci {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç terimlik Fibonacci dizisi oluşturmak istiyorsunuz?");
        int n = scanner.nextInt();

        int num1 = 0, num2 = 1;

        System.out.println("Fibonacci dizisi:");
        for (int i = 1; i <= n; ++i) {
            System.out.print(num1 + " ");

            int sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
        }

        scanner.close();

	}

}
//Emiralp Yakalı 2311502251