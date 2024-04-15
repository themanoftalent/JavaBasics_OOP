import java.util.Scanner;

public class GurhanK_SwitchGPA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Numaralara Sırasıyla ders notlarinizi giriniz!");
        int dersSayisi = 5;
        int dersSayisi2 = dersSayisi;
        double ders1;
        double toplam = 0;
        int gecme = 0;


        do {
            System.out.print("Ders notu giriniz: ");
            ders1 = scanner.nextInt();
            toplam += ders1;
            dersSayisi--;
        } while (dersSayisi > 0);

        if (toplam/dersSayisi2>=50){
            gecme =1;
        }

        switch (gecme){
            case 1:
                System.out.println("Geçtiniz!");
                break;
            case 0:
                System.out.println("Kaldiniz!");
        }

    }
}