import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a start number: ");
        int number = input.nextInt();

        if(number < 100){
            System.out.println("Please enter a number greater than 100");
            return;
        }

        for(int i = number; i>=0; i--){
                System.out.println(i);


        }
    }
}
