import java.util.Scanner;

public class Onur_M_U_Homework4FactorialCalculator {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Faktoriyel Sayısı :");
        int n = input.nextInt();
        int result = 1;
        for (int i = 2; i<=n; i++){
            result = result * i;
        }
        System.out.println("Sonuç :" + result);

    }
}