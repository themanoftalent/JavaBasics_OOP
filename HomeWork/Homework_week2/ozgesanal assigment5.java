//2311502210
//Fibonacci Sequence

import java.util.Scanner;
public class Asg5{
    public static void main(String[] args) {
        int first=1, second=1, next=0;

        Scanner fibonacci = new Scanner(System.in);
        System.out.println("Enter a term of fibonacci sequence: ");
        int term = fibonacci.nextInt();
        System.out.println(first+"\n"+second);

        for(int i=1; i<=term-2; i++){
            next = first+second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}
