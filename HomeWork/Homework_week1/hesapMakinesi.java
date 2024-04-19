package ödev2;

import java.util.Scanner;

class hesapMakinesi {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("İlk sayıyı girin:");
	        double num1 = scanner.nextDouble();

	        System.out.println("İkinci sayıyı girin:");
	        double num2 = scanner.nextDouble();

	        System.out.println("Yapmak istediğiniz işlemi seçin (+, -, *, /):");
	        char operator = scanner.next().charAt(0);

	        double result;

	        switch (operator) {
	            case '+':
	                result = num1 + num2;
	                System.out.println("Sonuç: " + result);
	                break;
	            case '-':
	                result = num1 - num2;
	                System.out.println("Sonuç: " + result);
	                break;
	            case '*':
	                result = num1 * num2;
	                System.out.println("Sonuç: " + result);
	                break;
	            case '/':
	                if (num2 != 0) {
	                    result = num1 / num2;
	                    System.out.println("Sonuç: " + result);
	                } else {
	                    System.out.println("Bir sayıyı sıfıra bölemezsiniz!");
	                }
	                break;
	            default:
	                System.out.println("Geçersiz işlem!");
	        }

	        scanner.close();

	}

}

//Emiralp Yakalı 2311502251