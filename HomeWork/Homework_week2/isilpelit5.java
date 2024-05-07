// Zeynep Işıl Pelit 2311502220
//Fibonacci
import java.util.*;
public class isilpelit5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("kaç terimli fibonacci dizisi olsun:");
        int n=scanner.nextInt();
        int a=0;
        int b=1;
        System.out.println("fibonacci dizisi");
        for(int i=0;i<n;i++){
            System.out.println(a+"");
            int temp=a;
            a=b;
            b=temp+b;
        }

    }
}
