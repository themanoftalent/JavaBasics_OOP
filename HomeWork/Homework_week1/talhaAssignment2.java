//Ahmet Talha Bodur 2311502242
// 2) Create a calculator that performs basic arithmetic operations based on user input.

import java.util.*;

public class talhaAssignment2 {
    public static float Sum(float num1, float num2){
        float result = num1 + num2;
        return result;
    }
    public static float Substract(float num1, float num2){
        float result = num1 - num2;
        return result;
    }
    public static float Multiply(float num1, float num2){
        float result = num1 * num2;
        return result;
    }
    public static float Divide(float num1, float num2){
        float result = num1 / num2;
        return result;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        float num1,num2,result;

        System.out.println("Enter the first number :");
        num1 = input.nextFloat();

        System.out.println("Enter the second number :");
        num2 = input.nextFloat();

        char operator;
        System.out.println("Select the operation you'd like to make:");
        operator = input.next().charAt(0);

        if (operator == '+')
            System.out.println("The result is :"+Sum(num1,num2));
        else if (operator == '-')
            System.out.println("The result is :"+Substract(num1,num2));
        else if (operator == '*')
            System.out.println("The result is :"+Multiply(num1,num2));
        else if (operator == '/')
            System.out.println("The result is :"+Divide(num1,num2));
        else
            System.out.println("You entered an invalid operation sign!");
    }
}