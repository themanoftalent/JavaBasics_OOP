// Arda Göktaş 2311502241
import java.util.*;
public class MonthsArda{

    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {

        String month;
        System.out.println("Enter the month:");
        month = input.next();

        int season = 0;

        if (month.equals("June") || month.equals("July") || month.equals("August"))
            season = 1;

        if (month.equals("September") || month.equals("October") || month.equals("November"))
            season = 2;

        if (month.equals("December") || month.equals("January") || month.equals("February"))
            season = 3;

        if (month.equals("March") || month.equals("April") || month.equals("May"))
            season = 4;

        switch (season){
            case 1:
                System.out.println("It is SUMMER!");
                break;

            case 2:
                System.out.println("It is AUTUMN!");
                break;

            case 3:
                System.out.println("It is WINTER!");
                break;

            case 4:
                System.out.println("It is SPRING!");
                break;

            default:
                System.out.println("Invalid Month!");
                break;
        }
    }
}