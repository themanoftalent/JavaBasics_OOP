import java.util.Scanner;

public class Ops {
    public static void main(String[] args) {
        Scanner yenihafıza = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter first number");
        float sayi1 = yenihafıza.nextFloat();

        System.out.println("Enter second number");
        int sayi2 = yenihafıza.nextInt();

        float toplam = sayi1 + sayi2;

        System.out.println("Toplam: " + toplam);
    }
}
