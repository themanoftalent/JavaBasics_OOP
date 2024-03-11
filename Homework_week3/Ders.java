import java.util.Scanner;
public class Ders {
	public static void main(String[] args) {
		
double toplam,cikarma,bolme,carpma;
  Scanner scanner = new Scanner(System.in);

System.out.print("Birinci sayıyı girin: ");
int sayi1 = scanner.nextInt();

System.out.print("İkinci sayıyı girin: ");
int sayi2 = scanner.nextInt();

toplam=sayi1+sayi2;
cikarma=sayi1-sayi2;
bolme=sayi1/sayi2;
carpma=sayi1*sayi2;
/*System.out.println(toplam);
System.out.println(cikarma);
System.out.println(carpma);
System.out.println(bolme);*/
System.out.println(toplam+" "+cikarma+" "+carpma+" "+bolme);
}
}
