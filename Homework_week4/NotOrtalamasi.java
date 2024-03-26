import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int not1, not2, not3, not4, not5;

        System.out.println("Lütfen 5 notu girin:");
        not1 = scanner.nextInt();
        not2 = scanner.nextInt();
        not3 = scanner.nextInt();
        not4 = scanner.nextInt();
        not5 = scanner.nextInt();

       
        int ortalama = (not1 + not2 + not3 + not4 + not5) / 5;

        
        System.out.println("Girilen notların ortalaması: " + ortalama);

        
        switch (ortalama >= 50 ? 1 : 0) {
            case 1:
                System.out.println("Geçti");
                break;
            default:
                System.out.println("Kaldı");
                break;
        }

        scanner.close();
    }
}

