import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int number=input.nextInt();
        int bolum=0;
        for(int i=2;i<number;i++){
            if(number%i==0){
                bolum++;
                break;
            }

        }
        if(number<0) {
            System.out.println("sayiniz negatif sayidir");

        } else if (number==0) {
            System.out.println("sayiniz 0 dir");


        } else if (number==1) {
            System.out.println("sayiniz 1 dir");


        }else {
            if(bolum==0){
                System.out.println("sayiniz asal sayidir");
            }
            else {
                System.out.println("sayiniz birleşik sayidir,asal sayi degildir");
                bolum=0;
            }
        }


    }
}