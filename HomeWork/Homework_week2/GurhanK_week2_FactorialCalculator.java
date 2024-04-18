import java.util.Scanner;

public class GurhanK_week2_FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyel için bir sayi giriniz: ");
        int sayi = scanner.nextInt();
        int faktor = 1;

        if (sayi >= 0){
            for (int i = 1; i <= sayi; i++) {
            faktor = faktor * i;
            }
            System.out.println("Girilen sayinin faktöriyeli: " + faktor);
        }
        else{
            System.out.println("Geçersiz bir sayi girdiniz");
        }
    }

}
