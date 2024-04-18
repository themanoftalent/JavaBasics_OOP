//Arda Göktaş 2311502241
import java.util.*;
public class ReverseStringArdaGoktas{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String original;
        System.out.println("Enter the string you want to reverse: ");
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
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}