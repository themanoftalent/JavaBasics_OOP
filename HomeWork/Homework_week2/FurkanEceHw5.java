import java.util.Scanner;

public class FurkanEceHw5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Lutfen Fibonacci sayilarina bir sinir belirleyiniz");

        int limit = in.nextInt();
        int i = 1;
        int j = 0;
        

        for(;limit > 0; limit--){
            int k = i + j;
            System.out.println(k);
            i = j;
            j = k;
        }
    }
}