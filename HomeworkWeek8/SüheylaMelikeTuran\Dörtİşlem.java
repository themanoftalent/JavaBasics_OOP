import java.util.InputMismatchException;
import java.util.Scanner;
public class Calculatör {
     public void Operations(){
         Scanner hafıza=new Scanner(System.in);
         try {
             System.out.println("İşlem seç.");
             System.out.println("1. Toplama");
             System.out.println("2. Çıkarma");
             System.out.println("3. Çarpma");
             System.out.println("4. Bölme");

             int choice =hafıza.nextInt();
             System.out.println("Birinci sayıyı gir.");
             int num1=hafıza.nextInt();
             System.out.println("İkinci sayıyı gir.");
             int num2=hafıza.nextInt();

             double sonuç=0;

             switch (choice){
                 case 1:
                     sonuç=num1+num2;
                     break;

                 case 2:
                     sonuç=num1-num2;
                     break;

                 case 3:
                     sonuç=num1*num2;
                     break;

                 case 4:
                     if (num2!=0){
                         sonuç=num1/num2;
                         break;
                     }
                     else {
                         throw new ArithmeticException("Bölme işlemi geçersiz, İkinci sayı 0 olamaz.");}
                     break;

                 default:
                     System.out.println("Geçersiz işlem");
                     return;
             }
             System.out.println("Sonuç:" +sonuç);
         }
         catch (InputMismatchException e){
             System.out.println("Geçersiz input girildi.");
         }
         catch (Exception e) {
             System.out.println("Hata" + e.getMessage());
         }
         finally {
            scanner.close();
         }
     }
}

public class MainC {
    public static void main(String[] args) {
        Calculatör hesapMak=new Calculatör();
        hesapMak.Operations();
    }
}
