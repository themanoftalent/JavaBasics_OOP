package soru01;

import java.util.Scanner;

class AyMevsim {

	public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Lütfen hangi ayda oldugumuzu girin: ");
		        String ay = scanner.next();

		        String oldugumuzMevsim;

		        switch (ay) {
		        case "aralik":
		        case "ocak":
		        case "subat":
		            oldugumuzMevsim = "KIŞ";
		            break;
		        case "mart":
		        case "nisan":
		        case "mayis":
		            oldugumuzMevsim = "İLKBAHAR";
		            break;
		        case "haziran":
		        case "temmuz":
		        case "agustos":
		            oldugumuzMevsim = "YAZ";
		            break;
		        case "eylul":
		        case "ekim":
		        case "kasim":
		            oldugumuzMevsim = "SONBAHAR";
		            break;
		        default:
		            oldugumuzMevsim = "Tanımlanmayan Ay Girdiniz";
		            break;
		    }

		        System.out.println("İçinde Bulunduğun Mevsim: " + oldugumuzMevsim);
		    }
}