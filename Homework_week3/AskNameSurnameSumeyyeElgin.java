import java.util.Scanner;

public class AskNameSurnameSumeyyeElgin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name, surname;

        System.out.print("isminizi giriniz: ");
        name = input.nextLine();

        System.out.print("soyisminizi giriniz: ");
        surname = input.nextLine();
    }
}
