//try catch
//2311502210
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
        public void Operations() {
            Scanner input = new Scanner(System.in);

            try{
                System.out.println("İşlem seç \n 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
                int secim = input.nextInt();

                System.out.println("1.sayiyi gir");
                int num1 = input.nextInt();
                System.out.println("2.sayiyi gir");
                int num2 = input.nextInt();

                int sonuc=0;

                switch (secim) {
                    case 1:
                        sonuc=num1+num2;
                        break;
                    case 2:
                        sonuc=num1-num2;
                        break;
                    case 3:
                        sonuc=num1*num2;
                        break;
                    case 4:
                        if(num2 != 0){
                            sonuc=num1/num2;
                        }
                        else {
                            throw new ArithmeticException("Sıfıra bölme hatası.");
                        }
                        break;
                    default:
                        System.out.printf("Geçersiz işlem");
                        return;
                }
                System.out.println("Sonuç= " + sonuc);
            }
            catch (InputMismatchException e) {
                System.out.println("Hata: Geçersiz giriş. Sayı giriniz.");
            }
            catch (ArithmeticException e) {
                System.out.println("Hata: " + e.getMessage());
            }
           finally {
                input.close();
            }
        }
}
public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.Operations();
    }
}
