import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment6 {

    static boolean isPalindrome(String in){
        String r = "";
        for (int i = in.length() - 1; i >= 0; i--){
            r += in.charAt(i);
        }

        return r.equals(in);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String text = sc.nextLine();

        if (isPalindrome(text))
            System.out.println("Girdiğiniz metin palindrom");
        else
            System.out.println("Girdiğiniz metin Palindrom değil");
    }
}
