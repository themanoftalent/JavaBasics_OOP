package hafta2;

import java.util.Scanner;

public class SumeyyeElginPalindromeCheck {

    public static boolean isPalindrome(String word) {
        String revWord = ""; //girilen kelimenin tersini atamak için boş bir string değişkeni oluşturduk

        for (int i = word.length() - 1; i >= 0; i--) { //burada stringimizin son değişkeninden başlayarak üzerinde gezerek revWord değişkenine ekledik
            revWord += word.charAt(i);
        }

        return word.equals(revWord); //burada da kelimeleri eşitlik durumuna göre false ya da true döndürecek
    }

    public static boolean isPalindrome2(String word) { //bu methodta ise girilen stringin baş ve son karakterlerinden başlayarak karşılaştırma yaptık
        int i = word.length() - 1, j = 0;
        while (j < i) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i--;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("bir kelime giriniz: ");
        String word = scan.nextLine();

        System.out.println("(1. fonksiyonda) girdiğiniz kelimenin palindromluk durumu: " + isPalindrome(word));
        System.out.println("(2. fonksiyonda) girdiğiniz kelimenin palindromluk durumu: " + isPalindrome2(word));

    }
}
