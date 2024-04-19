// Zeynep Işıl Pelit 2311502220
// ters metin
import java.util.Scanner;

public class isilpelit10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        String tersMetin = "";

        for (int i = metin.length() - 1; i >= 0; i--) {
            tersMetin += metin.charAt(i);
        }

        System.out.println("Ters: " + tersMetin);
    }
}
