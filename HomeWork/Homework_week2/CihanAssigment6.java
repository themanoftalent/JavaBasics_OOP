//Cihan Eren Karpınar - 2311502273
import java.util.Scanner;
public class CihanAssigment6 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String input = Scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for case-insensitive palindrome check
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
