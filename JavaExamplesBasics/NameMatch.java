import java.util.Scanner;

public class NameMatch {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter your name \n");
            String ad = "Akif";
            String isim = sc.nextLine();
            System.out.println("Enter your surname \n");
            String soyisim = sc.nextLine();
            System.out.println("Your name and surname: " + isim + " " + soyisim);

            if (isim.equals(ad) && soyisim.equals("Cifci")) {
                System.out.println("Welcome Akif Cifci");
            }
            else {
                System.out.println("Wrong");
            }
        }
    }



