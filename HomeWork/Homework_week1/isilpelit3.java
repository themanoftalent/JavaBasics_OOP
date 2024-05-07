// Zeynep Işıl Pelit 23111502220
//Tek mi Çift mi
import java.util.Scanner;
public class isilpelit3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi girin:");
        int sayi=scanner.nextInt();
        if(sayi%2==0){
            System.out.println("cifttir");}
        else{
            System.out.println("tektir");
        }
    }
}
