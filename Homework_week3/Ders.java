import java.util.Scanner;
public class Ders {
	public static void main(String[] args) {
		
  Scanner emirscanner = new Scanner(System.in);

System.out.print("Adınızı Girin: ");
String ad = emirscanner.nextLine();

System.out.print("Soyadınızı girin: ");
String soyad = emirscanner.nextLine();


System.out.println(ad+" "+soyad);
}
}
