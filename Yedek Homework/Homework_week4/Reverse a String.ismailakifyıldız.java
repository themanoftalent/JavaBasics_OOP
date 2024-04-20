import java.util.Scanner;
public class Main33 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = scanner.next();
		scanner.close();
		int a = word.length();
		
		for (int b=0; b<a;  b++){
		char c = word.charAt(b);}
	
		for(int d=a-1; 0<=d ; d--) {
		System.out.print(word.charAt(d));
			}
	}

}
