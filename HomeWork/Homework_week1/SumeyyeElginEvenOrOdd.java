package hafta1;
import java.util.Scanner;

public class SumeyyeElginEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("lütfen bir tam sayı giriniz: "); //kullanıcıdan sayıyı girmesini istedik
        int number = sc.nextInt();

        if (number % 2 == 0) { //burada da if ile kullanıcının girdiği sayının 2 ile bölünüp bölünmediğini kontrol ettik
            System.out.println(number + ", çifttir");
        } else {
            System.out.println( number + ", tektir. ");
        }
    }
}
