import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int faktoriyel=1;
        System.out.println("faktoriyel hesaplayan program");
        System.out.println("n! bulmak için bir n sayisi giriniz");
        int number=input.nextInt();
        for(int a=1;a<=number;a++){
            faktoriyel*=a;
        }
        System.out.println(faktoriyel);
    }
}