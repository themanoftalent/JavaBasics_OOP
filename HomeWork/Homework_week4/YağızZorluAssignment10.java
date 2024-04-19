package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment10 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("Bir metin giriniz : ");
       String input = sc.nextLine();

       System.out.println("Tersine çevrilen metin: " + reverse(input));
    }

    public static String reverse(String input) {
        char[] charArr = input.toCharArray();

        int start = 0;
        int end = input.length() - 1;

        while(start < end) {
            char temp = charArr[start];
            charArr[start] = charArr[end];
            charArr[end] = temp;
            start ++;
            end --;
        }
        return new String(charArr);   //Oluşturduğumuz karakter dizisini tersine çevirdikten sonra String'e dönüştürdük.
    }
}
