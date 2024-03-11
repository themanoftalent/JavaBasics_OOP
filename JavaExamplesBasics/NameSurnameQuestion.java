import java.util.Scanner;
public class NameSurnameQuestion {
    public static void main(String[] args) {
        java.util.Scanner yenihafıza = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your name \n");
        String isim = yenihafıza.nextLine();

        System.out.println("Enter your surname \n");
        String soyisim = yenihafıza.nextLine();
        System.out.println("Your name and surname: " + isim + " " + soyisim);

        if (isim.equals("Akif") && soyisim.equals("Cifci")) {

            System.out.println("Your name and surname are the same");
        } else {
            System.out.println("Your name and surname are different");
        }
    }
}
