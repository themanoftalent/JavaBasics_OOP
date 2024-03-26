import java.util.Scanner;

public class IfElseSumeyyeElgin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, surname;

        System.out.print("isminizi giriniz: ");
        name = input.nextLine();

        System.out.print("soyisminizi giriniz: ");
        surname = input.nextLine();

        if (name.equals("sümeyye") && surname.equals("elgin")){
            System.out.println("doğru kişisiniz! hoşgeldiniz " + name + " " + surname);
        } else {
            System.out.println("lütfen doğru isim ve soyisimle giriş yapınız");
        }
    }
}
