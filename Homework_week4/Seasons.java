import java.util.Scanner;

public class Seasons {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = reader.next();
        int number = 0;
        if (month.equals("Aralık") || month.equals("Ocak") || month.equals("Şubat")) {
            number = 1;
        } else if (month.equals("Mart") || month.equals("Nisan") || month.equals("Mayıs")) {
            number = 2;
        } else if (month.equals("Haziran") || month.equals("Temmuz") || month.equals("Ağustos")) {
            number = 3;
        } else if (month.equals("Eylül") || month.equals("Ekim") || month.equals("Kasım")) {
            number = 4;
        }

        switch (number) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Fail");
        }
    }
}
