import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ders {
    public void operations(){
        Scanner a= new Scanner(System.in);

        try{
            System.out.println("işlem seç");
            System.out.println("1.toplama");
            System.out.println("2. çıkarma");
            System.out.println("3. çarpma");
            System.out.println("4.bölme");

            int choice = a.nextInt();

            System.out.println("1.sayıyı gir");
            int num1= a.nextInt();

            System.out.println("2.sayıyı gir");
            int num2=a.nextInt();

            double sonuc= 0;

            switch (choice){
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
                if(num2!=0){
                 sonuc=num1/num2;
                 break;}

                else {
                    throw new ArithmeticException("bölme işlemi geçersiz");
                }
                break;
                default:
                    System.out.println("gecersiz işlem");
                    return;
            }

            System.out.println("sonuc"+sonuc);
        } catch (InputMismatchException e) {
            System.out.println("Hata: Lütfen sayı giriniz.");
        }catch (ArithmeticException e) {
            System.out.println("Hata: " + e.getMessage());
        }finally {
            scanner.close();
        }
    }
}//CEYDA ANKARA
