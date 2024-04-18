import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("tek mi cift mi programı");
        System.out.println("lutfen bir tam sayi giriniz sayi giriniz");
        int number =input.nextInt();
        if(number%2==0){
            System.out.println("sayiniz cift sayidir");

        }
        else {
            System.out.println("sayiniz cift sayi degildir");
        }
    }
}