import java.util.Random;
import java.util.Scanner;
public class randomNumberGame {
	public static void main (String [] args ) {
Scanner gameAnswer = new Scanner(System.in);
Random gameRanInt = new Random();
int gameNumber = gameRanInt.nextInt(100);
boolean isAnswerCorrect = true;
System.out.print("Enter your answer");
do {
int userNumber = gameAnswer.nextInt();
if (userNumber == gameNumber) {
System.out.println("Correct . \n you got the lucky number");
isAnswerCorrect = false;
}else if (userNumber < gameNumber){
System.out.println("Not correct the lucky number is bigger than yours answer try again");
}else {
System.out.println("Not correct the lucky number is less than your's answer try again");}
}while(isAnswerCorrect);
gameAnswer.close();
}
}
@themanoftalent
