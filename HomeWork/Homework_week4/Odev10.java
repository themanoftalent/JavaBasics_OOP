import java.util.Scanner;
import java.util.*;
import java.lang.String;
public class Odev10 {
    public static void main(String[] args) {
        System.out.println("Bir string gir");
        Scanner getstr = new Scanner(System.in);
        String str = getstr.nextLine();

        int uzunluk = str.length();
        char [] tersten = new char[uzunluk];
        for (int i = 0 ; i<uzunluk;i++){
            tersten[i] = str.charAt(uzunluk-1-i);
        }
        for (int i =0;i<uzunluk;i++){
            System.out.print(tersten[i]);
        }
    }
}
