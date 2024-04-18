import java.util.Scanner;

public class GurhanK_week2_PalindromeCheck {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir string al
        System.out.print("Bir string girin: ");
        String input = scanner.nextLine();

        // Palindrom kontrolü yap
        if (isPalindrome(input)) {
            System.out.println(input + " bir palindromdur.");
        } else {
            System.out.println(input + " bir palindrom değildir.");
        }

        scanner.close();
    }


    public static boolean isPalindrome(String str) {
        // Küçük harflere çevirip gereksiz boşlukları temizle
        String cleanStr = str.toLowerCase().replaceAll("\\s+", "");

        int left = 0;
        int right = cleanStr.length() - 1;

        while (left < right) {
            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
                return false; // Eşleşmeyen karakter bulunursa false döndür
            }
            left++;
            right--;
        }

        return true; // Eğer tüm karakterler eşleşiyorsa true döndür
    }
}

