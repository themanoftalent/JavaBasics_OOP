package hafta1;
import java.util.Scanner;

public class SumeyyeElginSimpleCalculator {

    public static void calculator(int n1, String selection, int n2) {
        switch (selection){  //switch case ile kullanıcının seçeneğine göre işlemleri yaptırdım
            case "+":
                System.out.println("seçtiğiniz işlem sonucu: " + (n1+n2));
                break;
            case "-":
                System.out.println("seçtiğiniz işlem sonucu: " + (n1-n2));
                break;
            case "*":
                System.out.println("seçtiğiniz işlem sonucu: " + (n1*n2));
                break;
            case "/":
                System.out.println("seçtiğiniz işlem sonucu: " + (n1/n2));
                break;
            default:
                System.out.println("geçerli bir işlem seçmediniz, lütfen tekrar deneyiniz!");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n1, n2;
        String selection;

        System.out.print("ilk sayıyı giriniz: ");
        n1 = input.nextInt();

        input.nextLine(); //kullanıcından int değer aldıktan hemen sonra string değer alırsak sonraki adıma atlıyor. bu sorunu çözmek için kullandım

        System.out.print("işlem seçiniz (+, -, *, /): ");
        selection = input.nextLine();

        System.out.print("ikinci sayıyı giriniz: ");
        n2 = input.nextInt();

        calculator(n1, selection, n2);

    }
}
