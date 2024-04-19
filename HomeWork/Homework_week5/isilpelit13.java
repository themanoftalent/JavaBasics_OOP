// Zeynep Işıl Pelit 2311502220
// öğe bulma
import java.util.Scanner;

public class isilpelit13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Diziyi oluşturma
        int[] dizi = {1,15,22,7,8,6,13,1};

        System.out.print("Aranacak öğeyi girin: ");
        int aranan = scanner.nextInt();

        int indeks = -1;

        // Doğrusal arama
        for (int i = 0; i < dizi.length; i++) {
            if (dizi[i] == aranan) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Öğe bulundu, indeks: " + indeks);
        } else {
            System.out.println("Öğe bulunamadı.");
        }

        scanner.close();
    }
}
