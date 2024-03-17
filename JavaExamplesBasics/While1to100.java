
import java.util.Scanner;
public class While1to100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        while (i <= 100) {
//     System.out.println(i);

            if (i ==70) {
                System.out.println(i);
                continue;
            }
                i++;
        }
    }
}