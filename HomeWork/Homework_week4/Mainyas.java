import java.util.*;

public class Mainyas {
    static Scanner input = new Scanner(System.in);
    public static void main (String[] args)
    {

        System.out.printf("yas giriniz:");
        int age = input.nextInt();

        switch (age){
            case 0:
                System.out.printf("yeni dogdu");
                break;
            case 1:
                System.out.printf("1 yasında");
                break;
            case 2:
                System.out.printf("2 yasında");
                break;
            case 18:
                System.out.printf("yetiskin");
                break;
            default:
                System.out.printf("yaslı");
                break;




        }



    }





}