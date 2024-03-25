import java.util.Scanner;

public class ArrayIntReverse {

	public static int[] read(int n) {
		int[] a = new int[n];
		int N = a.length;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < N; i++) {
			a[i] = scanner.nextInt();
		}

		scanner.close();
		return a;
	}

	public static int[] reverse(int[] a) {
		int N = a.length;
		int[] b = new int[N];

		for (int i = 0; i < N / 2 + 1; i++) {
			b[i] = a[N - i - 1];
			b[N - i - 1] = a[i];
		}

		return b;
	}

	public static void print(int[] a, int[] b) {
		System.out.print("\nInitial:\n");

		for (int num : a)
			System.out.print(num + " ");

		System.out.print("\nReversed:\n");
		for (int num : b)
			System.out.print(num + " ");
	}

	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);

		int[] a = read(n);
		int[] b = reverse(a);
		print(a, b);
	}
}