//2311502210
//Reverse to String

import java.util.Scanner;
public class Asg10 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = str.nextLine();

        System.out.println("Original string: "+word);
        int length = word.length();
        String reverse="";

        for (int i=length-1; i>=0; i--) {
            reverse += word.charAt(i);
        }
        System.out.println("Reverse of string: "+reverse);
    }
}
