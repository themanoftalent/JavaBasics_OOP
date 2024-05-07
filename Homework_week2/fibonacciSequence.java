import java.util.Scanner;
/*BURCİNKUTLUSAN*/
public class fibonacciSequence {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n1=0,n2=1,n3,i,n;
        System.out.println("Kac adet fibonacci sayisi gormek istiyorsunuz:");
        n = input.nextInt();
        if(n==1){
            System.out.println("0");
        }
        else {
            System.out.print(n1 + " " + n2);
            for (i = 2; i < n; ++i) {
                n3 = n1 + n2;
                System.out.print(" " + n3);
                n1 = n2;
                n2 = n3;
            }
        }
    }
}
