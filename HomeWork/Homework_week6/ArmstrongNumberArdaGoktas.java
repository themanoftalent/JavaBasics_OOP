//Arda Göktaş 2311502241
import java.util.*;
public class ArmstrongNumberArdaGoktas {
    public static int sumOfCubes(int num) {
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, 3);
            temp /= 10;
        }
        return sum;
    }
    public static boolean isArmstrong(int num){
        if(num == sumOfCubes(num)){
            return true;
        }
        return false;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.println("Please enter a number: ");
        num = input.nextInt();
        if(isArmstrong(num)== true){
            System.out.println(num + " is an ARMSTRONG number :)");
        }
        else{
            System.out.println(num + " is not an ARMSTRONG number");
        }
    }
}
