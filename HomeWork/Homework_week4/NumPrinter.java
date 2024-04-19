// Arda Göktaş 2311502241
import java.util.Scanner;
public class NumPrinter{
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        do{
            System.out.println("Enter a number: ");
            num = input.nextInt();
        }
        while(num<100);

        for (int i=num; i>0; i--){
            System.out.println(i);
        }
    }
}