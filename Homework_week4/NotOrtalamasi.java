import java.util.Scanner;

public class NotOrtalamasi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ders1, ders2, ders3, ders4, ders5;
        double ortalama;

        System.out.println("Lütfen 5 dersin notlarını giriniz:");
        System.out.print("Ders 1: ");
        ders1 = scanner.nextInt();
        System.out.print("Ders 2: ");
        ders2 = scanner.nextInt();
        System.out.print("Ders 3: ");
        ders3 = scanner.nextInt();
        System.out.print("Ders 4: ");
        ders4 = scanner.nextInt();
        System.out.print("Ders 5: ");
        ders5 = scanner.nextInt();

        ortalama = (ders1 + ders2 + ders3 + ders4 + ders5) / 5.0;

        switch ((int) ortalama / 10) {
            case 10:
            case 9:
            case 8:
            case 7:
            case 6:
                System.out.println("GEÇ");
                break;
            default:
                System.out.println("KAL");
                break;
        }
    }
}
