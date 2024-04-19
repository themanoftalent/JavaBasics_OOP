//Bekir kaan şahin 2311502223
import java.util.*;

public class Assignment10 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String original;
        System.out.println("Metin Giriniz:");
        original = input.next();

        String reversed = reverseString(original);

        System.out.println("" + original);
        System.out.println("" + reversed);
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
