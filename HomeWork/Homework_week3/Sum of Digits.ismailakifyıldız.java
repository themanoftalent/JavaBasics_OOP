import java .util.Scanner;
public class Main29 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= scanner.nextInt();
		int b=num;
		int c=0;
		int a=0;
		while (b > 0) {
				b= b/10;
				a++;
					}
		b=num; 
		while (a > 0) {
		c= (int) (c + b/Math.pow(10, a-1));
		b = (int) (b % Math.pow(10, a-1));
		a--;		
		}
		System.out.println("Sum of Digits of Number is "+c+".");
	scanner.close(); }

}
