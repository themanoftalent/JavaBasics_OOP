import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Sayıyı giriniz");
        int n1 = 0;
        try{
            n1 = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Tam sayı harici giriş");
            return;
        }

        System.out.println("2.Sayıyı giriniz");
        int n2 = 0;
        try{
            n2 = sc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Tam sayı harici giriş");
            return;
        }

        System.out.println("Yapılacak işleme uygun operatorü giriniz. (+,-,*,/)");
        String op = sc.nextLine();
        if (!Objects.equals(op, "+") && !Objects.equals(op, "-") && !Objects.equals(op, "*") && !Objects.equals(op, "/")){
            System.out.println("Hatalı operatör girişi");
            return;
        }

        int r = 0;
        switch (op){
            case "+":
                r = n1 + n2;
                System.out.println(r);
                break;
            case "-":
                r = n1 - n2;
                System.out.println(r);
                break;
            case "*":
                r = n1 * n2;
                System.out.println(r);
                break;
            case "/":
                try{
                    r = n1 / n2;
                    System.out.println(r);
                }catch(ArithmeticException e){
                    System.out.println("Sıfıra bölüm yapılamaz");
                }
                break;
        }
    }
}
