package Assignments;

import java.util.Scanner;

public class YağızZorluAssignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Birinci sayıyı giriniz: ");
        int number1 = sc.nextInt();

        sc.nextLine();   //Bunu eklemediğimde operatör ve ikinci sayıyı aynı anda istiyor.
        System.out.println("Uygun operatörü giriniz (+,-,*,/) : ");
        String operator = sc.nextLine();

        System.out.println("İkinci sayıyı giriniz: ");
        int number2 = sc.nextInt();

        float result = 0;

        if(number2 == 0) {
            System.out.println("Hatalı sayı girdiniz.");
            return;
        }

        switch(operator) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = (float) number1 / number2;
                break;
            default:
                System.out.println("Hatalı operatör girdiniz.");
        }

        System.out.println(result);
    }
}
