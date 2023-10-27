import java.util.Scanner;
public class factorialCalculator {
	public static void main(String[] args ) {
//		Factorial Calculator
int userNumber=1 , stepNumber=1;
Scanner userInput = new Scanner(System.in);
userNumber = userInput.nextInt();
if (userNumber == 0) {
System.out.println("1");
}else if(userNumber <0) {
System.out.println("please enter a nonnegative number");
}else {
System.out.println("Calculation process has been start ..."+"\n"+"Calculation is done.");

for(int followingNumber = 1 ; followingNumber <= userNumber ; followingNumber ++) {
	
	stepNumber = stepNumber * followingNumber;
	
}
userNumber = stepNumber;
System.out.println(userNumber);
}
userInput.close();
 }
}
@themanoftalent
