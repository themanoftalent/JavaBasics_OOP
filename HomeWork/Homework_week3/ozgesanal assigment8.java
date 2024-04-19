//2311502210
//Multiplication Table

import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner multiply = new Scanner(System.in);
        System.out.println("Enter a number for multiplication table: ");
        int num = multiply.nextInt();

        for(int i=1; i<=10; i++){
                int res = num*i;
                System.out.println(i+"*"+num+"="+res);
        }
    }
}
