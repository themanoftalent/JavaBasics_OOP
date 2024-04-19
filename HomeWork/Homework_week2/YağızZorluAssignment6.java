package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Bir metin giriniz : ");
        String input = sc.nextLine();

        if(isPalindrome(input)) {
            System.out.println("Girdiğiniz metin palindromdur.");
        } else {
            System.out.println("Girdiğiniz metin palindrom değildir.");
        }
    }

    public static boolean isPalindrome(String input) {
        int start = 0;
        int end = input.length() - 1;

        while(start < end) {
            if(input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start ++;
            end --;
        }
        return true;
    }
}
