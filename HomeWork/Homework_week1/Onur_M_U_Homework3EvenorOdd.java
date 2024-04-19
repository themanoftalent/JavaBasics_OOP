import java.util.Scanner;
public class Onur_M_U_Homework3EvenorOdd {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı Giriniz: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number +  "çift bir sayıdır.");
        } else {
            System.out.println(number +  "tek bir sayıdır.");
        }

    }
}