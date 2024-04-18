package Ödevler5.hafta;

import java.util.Scanner;

//2311502229 Ali Eren Hakut
public class ikiliarama {

	public static void main(String[] args) {
		    boolean varmi = false;
	        int satir = -1;
	        int sutun = -1;
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Dizinizin boyutunu giriniz: ");
	        int terim = sc.nextInt();

	        int[][] numbers = new int[terim][terim];

	        for (int i = 0; i < terim; i++) {
	            for (int j = 0; j < terim; j++) {
	                System.out.println((i + 1) + ". satır " + (j + 1) + ". sütun elemanını giriniz: ");
	                int eleman = sc.nextInt();
	                numbers[i][j] = eleman;
	            }
	        }

	        System.out.println("Aranacak elemanı giriniz: ");
	        int arananeleman = sc.nextInt();

	        for (int i = 0; i < terim; i++) {
	            for (int j = 0; j < terim; j++) {
	                if (numbers[i][j] == arananeleman) {
	                    varmi = true;
	                    satir = i + 1; 
	                    sutun = j + 1; 
	                    break; 
	                }
	            }
	            if (varmi) 
	                break;
	        }

	        if (varmi)
	            System.out.println("Aranan eleman bulundu. Bulunduğu sıra ve sütun: " + satir + ". satır, " + sutun + ". sütun");
	        else
	            System.out.println("Aranan eleman bulunamadı.");
	    }
	}