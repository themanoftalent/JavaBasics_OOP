// Mehmet akif cifci

import java.util.Scanner;

public class MonthCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your month ");
        String month = input.nextLine();
       switch (month) {
            case "January", "january":
                System.out.println("It is winter");
                break;
            case "February", "february":
                System.out.println("It is winter");
                break;
            case "March", "march":
                System.out.println("It is spring");
                break;
            case "April", "april":
                System.out.println("It is spring");
                break;
            case "May", "may":
                System.out.println("It is spring");
                break;
            case "June", "june":
                System.out.println("It is summer");
                break;
            case "July", "july":
                System.out.println("It is summer");
                break;
            case "August", "august":
                System.out.println("It is summer");
                break;
            case "September", "september":
                System.out.println("It is autumn");
                break;
            case "October", "october":
                System.out.println("It is autumn");
                break;
            case "November", "november":
                System.out.println("It is autumn");
                break;
            case "December", "december":
                System.out.println("It is winter");
                break;
            default:
                System.out.println("Invalid month");

}
}
}

