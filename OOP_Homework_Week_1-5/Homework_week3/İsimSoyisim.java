import java.util.Scanner;
public class İsimSoyisim {
    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("İsim Gir:");
        String isim = input.next();
        System.out.println("Soyisim gir");
        String soyisim=input.next();
        if(isim.equals("Cihan") && soyisim.equals("Karpınar")) {
            System.out.println("İsim ve soyisim doğru");
        }
        else {
            System.out.println("İsim ve soyisim yanlış");
        }
    }
}