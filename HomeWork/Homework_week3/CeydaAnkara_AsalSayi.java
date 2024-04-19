import java.util.Scanner;
public class asalsayi {
    public static void main(String[] args) {
        Scanner hafiza= new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int sayi= hafiza.nextInt();
         for(int i=2;i<sayi/2;i++)
         {
             if(sayi%i!=0){
                 System.out.println("Asal sayı");
                 continue;
             }
             else{
                 System.out.println("Asal sayı değil");
                 break;
             }

         }

    }//CEYDA ANKARA
}
