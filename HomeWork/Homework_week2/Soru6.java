import java.util.Scanner;
import java.util.concurrent.ForkJoinTask;
import java.util.zip.ZipEntry;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class Soru6 {

	public static void main(String[] args) {
		// Determine whether a given string is a palindrome.
		System.out.println("Palindrom test etme uyuglaması, lütfen bir kelime giriniz:");
		boolean kontrol = true;
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int sayi = input.length();
		int kontS = input.length() / 2;
		for (int a = 0; a < kontS; a++, sayi--) 
		{
			if (input.charAt(a) == input.charAt(sayi-1))
				continue;
			else {
				kontrol = false;
				break;
			}			
		}
		if(kontrol==true) 
		{
			System.out.println("Girdiğiniz kelime palindromdur.");
		}
		else {
			System.out.println("Girdiğiniz kelime palindrom değildir.");
		}

	}

}
