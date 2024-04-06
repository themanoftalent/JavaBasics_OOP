package isimvesoyisimalma;
import java.util.Scanner;
public class isimvesoyisimalma {
	 static Scanner input =new Scanner(System.in);
	    public static void main(String[] args) {

	        System.out.println("Enter your name :");
	        String name;
	        name = input.next();
	        System.out.println("Enter your surname :");
	        String surname;
	        surname = input.next();

	    }
	}
//isim soyisim doğrulama
 public class isimvesoyisimalma {
 static Scanner input =new Scanner(System.in);
 public static void main(String[] args) {

     System.out.println("Enter your name :");
     String name;
     name = input.next();
     if (name.equals("meltem")){
         System.out.println("Your name is correct!");
     }
     else System.out.println("Your name is incorrect!");
     System.out.println("Enter your surname :");
     String surname;
     surname = input.next();
     if (surname.equals("filiz")){
         System.out.println("Your surname is correct!");
     }
     else System.out.println("Your surname is incorrect!");

 }



		
		
		
		
		
		
		
		
		
		
