package hafta10;

import java.util.InputMismatchException;
import java.util.Scanner;

//try catch: abstraction yapıyoruz. end usera gereksiz hata returnlerden kurtararak anlayacağı dilde anlatıyoruz

public class SumeyyeElginCalculator {
    public void Operations() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("ilk sayıyı giriniz: ");
            int number1 = sc.nextInt();

            System.out.print("işlem seçiniz (+, -, *, /) ");
            char selection = sc.next().charAt(0);

            System.out.print("ikinci sayıyı giriniz: ");
            int number2 = sc.nextInt();

            switch (selection) {
                case '+':
                    System.out.println("işlem sonucunuz: " + (number1 + number2));
                    break;
                case '-':
                    System.out.println("işlem sonucunuz: " + (number1 - number2));
                    break;
                case '*':
                    System.out.println("işlem sonucunuz: " + (number1 * number2));
                    break;
                case '/':
                    if (number2 != 0) {
                        System.out.println("işlem sonucunuz: " + (number1 / number2));
                    } else {
                        //System.out.println("ikinci sayı 0'a eşit olamaz");
                        throw new ArithmeticException("ikinci sayı 0'a eşit olamaz");
                    }
                    break;
                default:
                   throw new InputMismatchException("yanlış bir input girdiniz, lütfen tekrar deneyiniz");
            }
        } catch (InputMismatchException e) {
            //to do: handle exception
            System.out.println("yanlış bir input girdiniz, lütfen tekrar deneyiniz");
            //catch birden fazla kullanılabilir
        } catch (ArithmeticException e) {
            System.out.println("hata! " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
