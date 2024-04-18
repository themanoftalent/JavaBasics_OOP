import java.util.Scanner;

public class EmreYilmazHomework5FibonacciSequence {
    public static void main(String[] args) {
        int first = 1, second = 1,now;
        Scanner sc = new Scanner(System.in);
        System.out.println("Kaçıncı terim olduğunu giriniz: ");
        int terim = sc.nextInt();

        for(int i=1;i<=terim;i++){
            if(i <= 2){
                System.out.println("1");
            }
            else{
                now = first + second;
                second = first;
                first = now;
                System.out.println(now);
            }
        }
    }
}
