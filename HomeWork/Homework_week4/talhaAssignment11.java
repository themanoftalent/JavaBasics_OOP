// Ahmet Talha Bodur 2311502242
// Calculate the sum and average of elements in an array.

import java.util.*;

public class talhaAssignment11 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        int Length;
        System.out.println("How many elemnts would you like to have in an array");
        Length = input.nextInt();

        int array[] = new int[Length];

        for (int i=0; i<Length; i++){
            System.out.println("Enter number "+ (i+1) +" :");
            array[i] = input.nextInt();
        }

        int sum = 0, average = 0;
        for(int i=0; i<array.length;i++){
            sum += array[i];
            average = sum / array.length;
        }

        System.out.println("Sum of the numbers in array is = "+ sum + " The average of the numbers is = "+ average);
    }
}