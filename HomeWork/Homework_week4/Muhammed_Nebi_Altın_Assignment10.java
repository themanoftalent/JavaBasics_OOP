import java.util.Arrays;
import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment10 {

    static String reverse(String in){

        int l = in.length();

        char[] inToArray = new char[l];

        for (int i = l; i > 0; --i){
            inToArray[l - i] = in.charAt(i - 1);
        }

        String out = "";
        for (int i = 0; i < l; i++){
            out += inToArray[i];
        }
        return out;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Bir metin giriniz");
        String text = sc.nextLine();

        System.out.println(text + " -> " + reverse(text));
    }
}
