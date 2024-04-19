import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tersine çevirmek için bir dize girin: ");
        String str = scanner.nextLine();
        scanner.close();

        String reversed = reverseString(str);
        System.out.println("Tersine çevrilmiş dize: " + reversed);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers
            left++;
            right--;
        }

        return new String(charArray);
    }
}