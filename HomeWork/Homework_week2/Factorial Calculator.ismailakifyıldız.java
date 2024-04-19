import java.util.Scanner;
public class Main11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int fac = 1;
		if (num < 0) {
			System.out.println("Not enter a negative number!");
		return;
	}
		else if (num == 0) {
			System.out.println("The factorial is 1.");
		}
		else {
		while (num > 1) {
			fac = fac * num;
			num--;
		} System.out.println("The factorial is "+fac+".");}
		scanner.close();
		


	}

}
