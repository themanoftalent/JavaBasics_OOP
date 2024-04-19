import java.util.Scanner;
public class Main28 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int a=0; //a = girilen sayının basamak sayısı
		int b = num;
		int c=0; // sayının tersine çevrilmiş hali
		while (b > 0) {
			b= b/10;
			a++;
				}
		b=num;
		while (a>0){
			
		int d = b%10;
		 c = c*10 + d;
			a--;
			b = b/10;
		}
		if (c == num) System.out.println("Its a Palindrome number.");
		else System.out.println("Its not a Palindrome number.");
	scanner.close(); }

}
