import java.util.Scanner;

public class Muhammed_Nebi_Altın_Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Yapılacak işleme uygun operatorü giriniz. (+,-,*,/)");
        String op = sc.nextLine();

        System.out.println("1.Sayıyı giriniz");
        int n1 = sc.nextInt();

        System.out.println("2.Sayıyı giriniz");
        int n2 = sc.nextInt();

        float r = 0;
        switch (op){
            case "+":
                r = n1 + n2;
                break;
            case "-":
                r = n1 - n2;
                break;
            case "*":
                r = n1 * n2;
                break;
            case "/":
                r = (float)n1 / n2;
                break;
        }

        System.out.println(r);

    }
}
