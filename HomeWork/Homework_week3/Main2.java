import java.util.Scanner;
public class Main2 {
    public static void main(String[]args) {
        double toplama,cikarma,bolme,carpma;
        Scanner scanner=new Scanner(System.in);
        System.out.println("birinci sayiyi gir:");
        double sayi1=scanner.nextDouble();
        System.out.println("ikinci sayiyi gir:");
        double sayi2=scanner.nextDouble();

        toplama=sayi1+sayi2;
        cikarma=sayi1-sayi2;
        bolme=sayi1/sayi2;
        carpma=sayi1*sayi2;
        System.out.println(toplama+" "+cikarma+" "+carpma+" "+bolme);
    }
}
