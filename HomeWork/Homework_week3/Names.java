import java.util.Scanner;

public class Names {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name");
        String isim = input.nextLine();
        System.out.println("Please enter your surname");
        String soyisim  = input.nextLine();
        System.out.println(isim +" "+ soyisim);
    }
}