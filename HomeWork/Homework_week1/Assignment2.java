//bekir kaan şahin 2311502223
import java.util.*;
public class Assignment2 {
    public static float toplam(float num1,float num2){
        float sonuc= num1+num2;
        return sonuc;
    }
    public static float fark(float num1,float num2){
        float sonuc= num1-num2;
        return sonuc;
    }
    public static float carpma(float num1,float num2){
        float sonuc= num1*num2;
        return sonuc;
    }
    public static float bolme(float num1,float num2){
        float sonuc= num1/num2;
        return sonuc;
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        float num1,num2,sonuc;
        System.out.printf("ilk sayiyi giriniz:");
            num1 =input.nextFloat();
        System.out.printf("ikinci sayiyi giriniz:");
            num2 =input.nextFloat();

            char islem;
        System.out.printf("islemi seciniz:");
        islem=input.next().charAt(0);

        if (islem == '+') {
            sonuc = toplam(num1, num2);
        }
        else if (islem == '-') {
            sonuc = fark(num1,num2);
        }
        else if (islem == '*') {
            sonuc = carpma(num1,num2);
        }
        else{
            sonuc = bolme(num1,num2);

        }
        System.out.printf("Sonuç:"+sonuc);
    }
}