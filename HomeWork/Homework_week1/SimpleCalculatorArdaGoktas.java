// Arda Göktaş 2311502241
import java.util.*;
public class SimpleCalculatorArdaGoktas {
    public static double Sum(double num1,double num2){
        double result = num1 + num2;
        return result;
    }
    public static double Substraction(double num1, double num2){
        double result = num1 - num2;
        return result;
    }
    public static double Division(double num1, double num2){
        double result = num1 / num2;
        return result;
    }
    public static double Multiplication(double num1, double num2){
        double result = num1 * num2;
        return result;
    }

    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {
        char operator;
        double num1,num2;
        System.out.println("Please select an operation: ");
        operator = input.next().charAt(0);
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();


        if(operator == '+'){
             System.out.println(Sum(num1,num2));
        }
        else if(operator == '-'){
            System.out.println(Substraction(num1, num2));
        }
        else if(operator == '*'){
            System.out.println(Multiplication(num1, num2));
        }
        else if(operator == '/'){
            System.out.println(Division(num1, num2));
        }
        else{
            System.out.println("Please Enter a valid operation sign!!");
        } 
    }
}
