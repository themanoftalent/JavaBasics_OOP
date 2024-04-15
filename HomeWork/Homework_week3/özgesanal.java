//kullanicidan girilen iki sayinin bes farklı islemi

public class Main {
		public static void main(String[] args) {
			java.util.Scanner numbers = new Scanner(System.in);
			System.out.println("enter num1:");
			int num1 = numbers.nextInt();
			
			System.out.println("enter num2=");
			int num2 = numbers.nextInt();
			
			System.out.println("toplam="+(num1+num2));
			System.out.println("fark="+(num1-num2));
			System.out.println("çarpım="+(num1*num2));
			System.out.println("bölüm="+(num1/num2));
			System.out.println("kalan="+(num1%num2));
	}
}
//kullanicidan alinan isim soyismi yazdirip dogruluguna bakma

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		java.util.Scanner namesurname = new Scanner(System.in);
		
		System.out.println("İsminizi Girin:");
		String isim = namesurname.nextLine();
		
		System.out.println("Soyisminizi Girin:");
		String soyisim = namesurname.nextLine();
		
		System.out.println("Isminiz ve Soyisminiz: "+isim+" "+soyisim);
		if((isim.equals("Ozge") && soyisim.equals("Sanal")) || (isim.equals("ozge")&&soyisim.equals("sanal"))) {
			System.out.println("Isminizi dogru girdiniz");
		}
		else {
			System.out.println("Isminizi yanlıs girdiniz");
		}
	}
}
