import java.util.Scanner;

public class FurkanEceHw3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number3 = in.nextInt();

        if(number3 % 2 ==0){
            System.out.println("Girilen sayi cifttir");
        }
        else{
            System.out.println("Girilen sayi tektir");
        }
    }
}