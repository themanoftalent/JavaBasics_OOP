package Week8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class YağızZorluDortIslemJava {


    public void Operations() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("İşlem seç: ");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");

            int choice = sc.nextInt();
            System.out.println("1.sayıyı giriniz:");
            int num1 = sc.nextInt();

            System.out.println("2.sayıyı giriniz: ");
            int num2 = sc.nextInt();

            double sonuc = 0;

            switch(choice) {
                case 1:
                sonuc = num1 + num2;
                    System.out.println(sonuc);
                break;

                case 2:
                    sonuc = num1 - num2;
                    System.out.println(sonuc);
                    break;

                case 3:
                    sonuc = num1 * num2;
                    System.out.println(sonuc);
                    break;

                case 4:
                    if(num2 != 0) {
                        sonuc = num1/num2;
                        System.out.println(sonuc);
                    break;
                    } else {
                        throw new ArithmeticException("İşlem geçersiz.");
                    }
            }

        } catch (InputMismatchException e) {
            System.out.println("Geçersiz input girdin.");
        } catch(ArithmeticException e) {
            System.out.println("Sıfıra bölme hatası");
        } finally {
            sc.close();
        }
    }
}
