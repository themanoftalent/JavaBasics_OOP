import java.util.Scanner;
public class caroimtablosu {
    public static void main(String[] args) {
        Scanner hafiza= new Scanner(System.in);
        System.out.println("Sayi giriniz");
        int sayi= hafiza.nextInt();
        for(int i=1;i<10;i++) {
            int a= sayi*i;
            System.out.println(i +"x"+sayi+"="+a);
        }
    }
}//CEYDA ANKARA
