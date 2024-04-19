import java.util.Scanner;
public class Main31 {

	public static void main(String[] args) {
		System.out.println("Prime Number Checker");
		System.out.println("Enter number: ");
		Scanner scanner= new Scanner(System.in);
		int a = scanner.nextInt();
		scanner.close();
		int b = 0;
		for (int c= 2; a > c ; c++) {
			if (a%c==0) { b++;
			 break;}
		}
		if (b == 0 || a == 2) System.out.println("Its a Prime Number!");
		else System.out.println("Its not a Prime Number!");
	}

}
