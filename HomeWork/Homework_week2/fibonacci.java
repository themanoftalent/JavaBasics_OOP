package fibonacci;
import java.util.Scanner;
public class fibonacci {
	    public static void main(String[] args) {

	        Scanner input = new Scanner(System.in);
	        int a1=0;
	        int a2=1;
	        int a,a3,i;

	        System.out.println("A sayisini giriniz : ");
	        a= input.nextInt();

	        System.out.println(a1+" "+a2);

	        for(i=0;i<a;i++){
	            a3=a1+a2;
	            System.out.println(" "+a3);
	            a1=a2;
	            a2=a3;
	        }
	        System.out.println();
	    }
	}