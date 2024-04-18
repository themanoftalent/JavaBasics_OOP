// Ahmet Talha Bodur 2311502242
// Reverse a string without using built-in functions.

import java.util.*;

public class talhaAssignment10 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String original;
        System.out.println("Enter the string that will be reversed:");
        original = input.next();

        String reversed = reverseString(original);

        System.out.println("Original string: " + original);
        System.out.println("Reversed string: " + reversed);
    }
    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move the left pointer forward and the right pointer backward
            left++;
            right--;
        }

        // Convert character array back to string
        return new String(charArray);
    }
}
