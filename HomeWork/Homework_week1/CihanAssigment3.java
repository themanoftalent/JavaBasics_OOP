//Cihan Eren Karpınar - 2311502273

import java.util.Scanner;

public class CihanAssigment3 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = Scanner.nextInt();
        if (number % 2 == 0) {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }
}