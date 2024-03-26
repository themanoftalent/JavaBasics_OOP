import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a month: ");
        String month=s.nextLine();
        String st=month.toUpperCase();
        switch(st){
            case "DECEMBER":
            case "JANUARY":
            case "FEBRUARY":
                System.out.println("~WINTER IS COMING~");
                break;
            case "MARCH":
            case "APRİL":
            case "MAY":
                System.out.println("~SPRING~");
                break;
            case "JUNE":
            case "JULY":
            case "AUGUST":
                System.out.println("~SUMMER~");
                break;
            case "SEPTEMBER":
            case "OCTOBER":
            case "NOVEMBER":
                System.out.println("~AUTUMN~");
                break;
            default:
                System.out.println("Do not have a exist!");
                break;
        }
    }
}
