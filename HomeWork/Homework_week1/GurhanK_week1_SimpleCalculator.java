import java.util.Scanner;

public class GurhanK_week1_SimpleCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Yapmak istediğiniz işlemi seçin:");
        System.out.println("1 Toplama");
        System.out.println("2 Çıkarma");
        System.out.println("3 Çarpma");
        System.out.println("4 Bölme");

        System.out.print("İşlem numarasını giriniz: ");
        int operator = scan.nextInt();


        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scan.nextInt();
        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scan.nextInt();

        hesap(operator, sayi1, sayi2);
    }

    public static void hesap(int operator, int a, int b) {
        double result;

        switch (operator) {
            case 1:
                result = a + b;
                System.out.println(a + " + " + b + " = " + result);
                break;
            case 2:
                result = a - b;
                System.out.println(a + " - " + b + " = " + result);
                break;
            case 3:
                result = a * b;
                System.out.println(a + " * " + b + " = " + result);
                break;
            case 4:
                    result = (double) a / b;
                    System.out.println(a + " / " + b + " = " + result);
                break;
            default:
                System.out.println("Geçersiz işlem numarası!");
                break;
        }
    }
}
