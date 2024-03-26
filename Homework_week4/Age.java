import java.util.Scanner;
public class Age {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the age: ");
    int age = input.nextInt();
    switch (age){
        case 0:
            System.out.print("Just born");
            break;
        case 1:
            System.out.println("Age 1");
            break;
        case 5:
            System.out.println("Age 5");
            break;
        case 7:
            System.out.println("Start school");
            break;
        case 15:
            System.out.println("Start high school");
            break;
        case 18:
            System.out.println("Start university");
            break;
        default:
            System.out.println("Older");
            break;
        }
    }
}