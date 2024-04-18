//bekir kaan şahin 2311502223
import  java.util.*;
public class Assignment6 {
     static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1,num2=0,num3,a,bas=0;
        System.out.printf("Sayi Giriniz:");
        num1 = input.nextInt();
        num3=num1;
            do{
                a=num1%10;
                num1=(num1-a)/10;
                bas++;
                num2=(10*num2)+a;
            }   while (num1>0);
        System.out.printf(""+num2);
        if(num3==num2){
            System.out.printf("\nPolindrom sayi");

        }
        else
            System.out.printf("\nPolindrom sayi degil");
    }
}