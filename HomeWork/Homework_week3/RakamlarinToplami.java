import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("bir sayi giriniz");
        int number=input.nextInt();
        int numberSum=0;
        while (number>0){
            int a=number%10;
            numberSum+=a;
            number=(number-a)/10;
        }
        System.out.println(numberSum);
    }
}