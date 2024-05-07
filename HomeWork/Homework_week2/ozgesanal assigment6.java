//2311502210
//Palindrome Check

import java.util.Scanner;
public class Asg6{
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter for palindrome check");
        int num = number.nextInt();
        int reverse=0, remainder=0, temp;

        temp = num;
        while(temp>0){
            remainder = temp%10;
            temp/=10;
            reverse = (reverse + remainder) * 10;
        }
        System.out.println("Reverse of number is: "+reverse/10);
        if(num==reverse/10){
            System.out.println("This number is a palindrome num.");
        }
        else{
            System.out.println("This number isn't a palindrome num.");
        }
    }
}
