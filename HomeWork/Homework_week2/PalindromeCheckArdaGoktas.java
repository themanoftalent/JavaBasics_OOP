// Arda Göktaş 2311502241
import java.util.*;
public class PalindromeCheckArdaGoktas {
    public static boolean isPalindrome(String word){
        if(word.equals(reverse(word))){
            return true;
        }
        return false;
    }
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
    
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String word;
        System.out.println("Enter a word");
        word = input.next();
        if(isPalindrome(word)){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not palindrome");
        }
        
    }
}
