import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=s.nextInt();
        if(number<100){
            do{
                System.out.println("Number is smaller than 100. Try Again");
                number= s.nextInt();
            }while(number<100);
        }
        for(int i=number; i>=0;i--) {
            System.out.println(i);
        }
    }
}
