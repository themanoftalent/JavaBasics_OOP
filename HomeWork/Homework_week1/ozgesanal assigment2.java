//2311502210
//Simple Calculator

import java.util.Scanner;
public class Asg2{
    public static void main(String[] args) {
        Scanner calculator = new Scanner(System.in);

        System.out.println("Choose one operation " +
                "\n + for plus \n - for minus \n * for multiply " +
                "\n / for divide \n % for remainder");
        String op = calculator.nextLine();

        System.out.println("Enter 1st number: ");
        float num1 = calculator.nextFloat();
        System.out.println("Enter 2st number: ");
        float num2 = calculator.nextFloat();

        if(op.equals("+")){
            System.out.println("The answer is "+(num1+num2));
        }
        else if(op.equals("-")){
            System.out.println("The answer is "+(num1-num2));
        }
        else if(op.equals("*")){
            System.out.println("The answer is "+(num1*num2));
        }
        else if(op.equals("/")){
            System.out.println("The answer is "+((double)num1/num2));
        }
        else if(op.equals("%")){
            System.out.println("The answer is "+(num1%num2));
        }
        else{
            System.out.println("You entered a wrong char!");
        }
    }
}
