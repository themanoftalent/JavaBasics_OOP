import java.util.Arrays;
import java.util.Scanner;
public class DiziSıralama {
    public static void main(String[] args) {
        Scanner hafiza=new Scanner(System.in);
        int[] dizi= new int[3];
        System.out.println("Dizinin elemanlarını giriniz");
        for(int i=0;i< dizi.length;i++){
            dizi[i]= hafiza.nextInt();
        }
        Arrays.sort(dizi);
        for(int i=0;i< dizi.length;i++) {
            System.out.println(dizi[i]);
        }
    }
}//CEYDA ANKARA
