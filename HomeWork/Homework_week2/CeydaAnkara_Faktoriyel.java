import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner hafiza= new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi= hafiza.nextInt();
        int carpım=1;
        for (int i=1;i<sayi+1;i++){
             carpım *=i;
        }
        System.out.println(sayi+" sayısının faktöriyeli: "+carpım);
    }
//CEYDA ANKARA
}
