//2311502210
//Sum of Digits

import java.util.Scanner;
public class Asg7{
    public static void main(String[] args) {
        Scanner sum = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int remainder=0, temp, result=0;
        int num = sum.nextInt();

        temp = num;
        while(temp!=0){
            remainder = temp%10;
            temp/=10;
            result += remainder;
        }
        System.out.println("The sum of digits "+result);
    }
}
