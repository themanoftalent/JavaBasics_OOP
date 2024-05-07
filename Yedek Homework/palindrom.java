import java.util.Scanner;
public class palindrom {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir dize girin: ");
	        String str = scanner.nextLine();
	        scanner.close();

	        if (isPalindrome(str)) {
	            System.out.println("Girilen dize bir palindromdur.");
	        } else {
	            System.out.println("Girilen dize bir palindrom değildir.");
	        }
	    }

	    public static boolean isPalindrome(String str) {
	        str = str.toLowerCase(); // Küçük/kapital harf duyarlılığını kaldır
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
