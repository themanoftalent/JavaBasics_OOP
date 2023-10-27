import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.print("Pozitif bir sayı giriniz: ");
        int n = number.nextInt();
        int i;
        int factorial = 1;
        if(n < 0){
            System.out.println("Negatif bir sayı girdiniz. Faktöriyel hesaplanamaz.");
        }
        else{
            for(i = 1; i<= n; i++){
                factorial = factorial * i;
            }
            System.out.println (n + " sayısının faktöriyeli " + n + "! = "  + factorial);
        }

    number.close();
    }
}
