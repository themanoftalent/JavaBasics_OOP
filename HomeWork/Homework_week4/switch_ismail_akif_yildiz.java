import java.util.Scanner;
public class Main15 {

	public static void main(String[] args) {
		
		Scanner scanner =  new Scanner(System.in);
		
		System.out.println("Not 1: ");
		double not1 = scanner.nextDouble();
		System.out.println("Not 2: ");
		double not2 = scanner.nextDouble();
		System.out.println("Not 3: ");
		double not3 = scanner.nextDouble();
		scanner.close();
		double gpa = (not1 + not2 + not3) / 3;
	
	
		if (gpa<45) System.out.println("F");
		else if (gpa<50)  System.out.println("E");
		else if (gpa<60)  System.out.println("D");
		else if (gpa<70)  System.out.println("C");
		else if (gpa<80)  System.out.println("B");
		else System.out.println("A");
		
		
		
	
		
	}

}
