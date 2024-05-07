import java.util.Scanner;

public class NgHomework2 {
    public static void main(String[] args) {
        double toplama,cikarma,bolme,carpma;
        Scanner scanner= new Scanner(System.in);
        System.out.println("birinci sayıyı girin");
        int sayi1= scanner.nextInt();
        System.out.println("ikinci sayiyi girin");
        int sayi2= scanner.nextInt();
        toplama=sayi1+sayi2;
        cikarma=sayi1-sayi2;
        bolme=sayi1/sayi2;
        carpma=sayi1*sayi2;
System.out.println(toplama+" "+cikarma+" "+bolme+" "+carpma);

    }
}
