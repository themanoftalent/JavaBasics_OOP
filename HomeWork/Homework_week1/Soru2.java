import java.io.CharArrayWriter;
import java.util.Scanner;

public class Soru2 {

	public static void main(String[] args) {
      //Create a calculator that performs basic arithmetic operations based on user input.
       int a, b ; 
       char islem;
       System.out.println("Lütfen bir numara giriniz: ");
       Scanner scanner = new Scanner(System.in);
       a = scanner.nextInt();
       System.out.println("Lütfen diğer numarayı giriniz: ");
       b = scanner.nextInt(); 
       System.out.println("Lütfen yapmak istediğiniz işlemi'+ , - , / , *' şeklinde giriniz.");
       islem = scanner.next().charAt(0);   
       switch(islem)
       {
       case '+' :
       System.out.println("Yaptığınız işlemin sonucu : " + (a+b) );
       break;
       case '-' :
           System.out.println("Yaptığınız işlemin sonucu : " + (a-b));
           break;
       case '/' :
           System.out.println("Yaptığınız işlemin sonucu : " + (a/b));
           break;
           	    		
       case '*' :
           System.out.println("Yaptığınız işlemin sonucu : " + (a*b));
           break;
           	
       }
       
    
       
	}

}
