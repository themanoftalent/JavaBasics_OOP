import java.util.Scanner;
public class fibonacci {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Fibonacci dizisinin kaç terimine kadar oluşturulmasını istiyorsunuz? ");
	        int n = scanner.nextInt();
	        scanner.close();

	        System.out.println("Fibonacci dizisi:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(fibonacci(i) + " ");
	        }
	    }

	    public static int fibonacci(int n) {
	        if (n == 0)
	            return 0;
	        else if (n == 1)
	            return 1;
	        else
	            return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	
}
