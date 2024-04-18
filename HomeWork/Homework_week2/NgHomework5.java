import java.util.Scanner;

public class NgHomework5 {
    public static void main(String[] args) {
        System.out.println("dizinin kaç terimini istiyorsunuz:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("fibonacci dizisi:");

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacci(i));
        }
    }
        public static int fibonacci(int n) {

            if(n<=1){
                return n;
            }else{
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }
    }

