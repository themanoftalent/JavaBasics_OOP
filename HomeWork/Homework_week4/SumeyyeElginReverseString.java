package hafta4;

import java.util.Scanner;

public class SumeyyeElginReverseString {

    public static void reverseString(String str) {
        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        System.out.println("girdiğiniz kelimenin tersi: " + revStr);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("bir kelime giriniz: ");
        String str = scan.nextLine();

        reverseString(str);
    }
}
