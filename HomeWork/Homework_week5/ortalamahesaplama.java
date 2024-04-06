package ortalamahesabi;
import java.util.Scanner;

public class ortalamahesaplama {
	  public static void main(String[]args){
	        int not1,not2,not3,not4,not5;
	        Scanner notlar = new Scanner(System.in);
	        System.out.println("not1 girin: ");
	        not1 = notlar.nextInt();
	        System.out.print("not2 girin: ");
	        not2 = notlar.nextInt();
	        System.out.print("not3 girin: ");
	        not3 = notlar.nextInt();
	        System.out.print("not4 girin: ");
	        not4 = notlar.nextInt();
	        System.out.print("not5 girin: ");
	        not5 = notlar.nextInt();
	        float ort = (not1+not2+not3+not4+not5)/5;
	            if( ort>50)
	            System.out.println("gectin!!");
	             else
	            System.out.println("kaldin!!!");
	        }

}
