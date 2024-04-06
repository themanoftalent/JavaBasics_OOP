import java.util.Scanner;

public class FurknOdevIslemler{

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the first number: ");
		int numberOne = scan.nextInt();
		System.out.println("Please enter the second number: ");
		int numberTwo = scan.nextInt();
		System.out.println("Please enter your math operation(+, -, *, /, %) \n" );
		char operator = scan.next().charAt(0);
		
		switch(operator) {
		
		//case '+':   System.out.println(numberOne+ " + " +numberTwo+" = "+ (numberOne+numberTwo)); 		break;
		
		case '+':	System.out.println("Toplama sonucu: "+ (numberOne+numberTwo));		break;
		
		case '-':	System.out.println("Cikarma sonucu: "+ (numberOne-numberTwo));		break;
		
		case '*':	System.out.println("Carpma islemi sonucu: "+(numberOne*numberTwo)); break;
		
		case '/':	float temp=Float.valueOf(numberOne)/Float.valueOf(numberTwo); 
					System.out.println("Bölme islemi sonucu: "+temp);					break;
					
		case '%':   System.out.println(numberOne +" mod "+ numberTwo +" islemi sonucu: "+(numberOne%numberTwo));		break;
		
		default:  	System.out.println("Unvalid operator");
		} 

	}

}
