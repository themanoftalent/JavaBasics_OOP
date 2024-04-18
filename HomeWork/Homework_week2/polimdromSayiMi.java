import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("sayinizin polindirom olup olmadiğini ögrenmek icin sayi giriniz");
        int number=input.nextInt();
        int polindromNumber;
        int sum=0;
        polindromNumber=number;
        while(number>0){
            int a=number%10;
            sum=(sum*10)+a;
            number=(number-a)/10;
        }
        System.out.println(polindromNumber);
        System.out.println(sum);
        if(sum==polindromNumber){
            System.out.println("sayiniz polindrom sayidir");

        }else {
            System.out.println("sayiniz polindrom degildir");
        }
    }
}