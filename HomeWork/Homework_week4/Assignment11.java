//Bekir kaan şahin 2311502223
import java.util.*;
public class Assignment11 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int num1,toplam=0;
        System.out.printf("Dizi uzunluğu giriniz:");
        num1 = input.nextInt();
        int array[] = new int[num1];

        for(int i=0;i<num1;i++)
        {
            array[i]=input.nextInt();


        }
        for(int j=0;j<num1;j++)
        {
            toplam=toplam+array[j];

        }
        float ort =(float)  toplam/num1;
        System.out.printf(""+toplam);
        System.out.printf("\n"+ort);
    }
}