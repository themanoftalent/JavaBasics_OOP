import java.util.Scanner;

public class NgHomework10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir string girin: ");
        String orijinal = scanner.nextLine();

        String ters = tersString(orijinal);

        System.out.println("Ters çevrilmiş string: " + ters);
    }

    public static String tersString(String str) {
        StringBuilder ters = new StringBuilder(str).reverse();
        return ters.toString();
    }
}

