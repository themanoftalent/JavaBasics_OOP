import java.util.Scanner;
public class İkiSayiTopla {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sayi1 = sc.nextInt() ; 
        int sayi2 = sc.nextInt(); 

        int toplam=sayi1+sayi2;
        float bolme=(float)sayi1/(float)sayi2;
        int carpim = sayi1*sayi2;
        int cikarma = sayi1-sayi2;

        System.out.println("Toplam: "+toplam);
        System.out.println("Fark: "+cikarma);
        System.out.println("Carpım: "+carpim);
        System.out.println("Bölüm: "+bolme);
    }
}
