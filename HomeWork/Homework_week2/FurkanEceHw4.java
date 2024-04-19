import java.util.Scanner;

public class FurkanEceHw4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Lutfen faktoriyeli alinacak olan sayiyi giriniz");
        int number = in.nextInt();
        int temp = number;
        int answer = 1;

        for(;temp > 0;temp--){
         answer *= temp;
        }
        System.out.println(number + " sayisinin faktoriyeli: " + answer);
    }
}