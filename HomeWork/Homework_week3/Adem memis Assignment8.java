import java.util.Scanner;
public class Ders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int carpim;
        int sayi = scan.nextInt();
        for(int i =1;i<=9;i++){
            carpim=sayi*i;
            System.out.println(sayi+"*"+i+"="+carpim);
        }
    }
}
