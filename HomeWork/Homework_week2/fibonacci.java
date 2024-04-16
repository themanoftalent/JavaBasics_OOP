package Ödevler2.hafta;

import java.util.Scanner;
//2311502229 Ali Eren Hakut
public class fibonacci {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("sayi giriniz: ");
		int sayi1 = scanner.nextInt();
		int[] fib = new int[sayi1];
		fib[0] = 1;
		fib[1] = 1;
		for (int i = 2; i != sayi1; i++) {
			fib[i] = fib[i - 1] + fib[i - 2];
		}
		System.out.println(fib[sayi1 - 1]);
		scanner.close();
	}
}
