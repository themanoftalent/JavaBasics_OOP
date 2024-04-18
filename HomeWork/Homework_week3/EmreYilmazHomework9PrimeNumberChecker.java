import java.util.Scanner;

public class EmreYilmazHomework9PrimeNumberChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        int number = sc.nextInt();
        boolean asalmi = true;

        for(int i = 2; i<number/2; i++){
            if(number % i == 0){
                asalmi = false;
                break;
            }
        }
        if(asalmi) System.out.println("Asal");
        else System.out.println("asal değil.");
    }
}
