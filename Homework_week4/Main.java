// Arda Göktaş 2311502241
import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String month;
        int season = 0;
        System.out.println("Please Enter a month: ");
        month = input.next();
        if (month.equals("December") || month.equals("January") || month.equals("February") ){
            season = 1;
        }
        if (month.equals("March") || month.equals("April") || month.equals("May") ){
            season = 2;
        }
        if (month.equals("June") || month.equals("July") || month.equals("August") ){
            season = 3;
        }
        if (month.equals("September") || month.equals("October") || month.equals("November") ){
            season = 4;
        }
        switch (season){
            case 1:
                System.out.println("It is Winter");
                break;
            case 2:
                System.out.println("It is Spring");
                break;
            case 3:
                System.out.println("It is Summer");
                break;
            case 4:
                System.out.println("It is Autumn");
                break;
            default:
                System.out.println("Please Enter valid month)");
                break;
        }
    }
}