import java.util.*;
import java.lang.String;
import java.util.Scanner;
public class Odev6 {
    public static void main(String[] args) {
        int flag = 0;
        System.out.println("Kontrol için dizi gir");
        Scanner getdizi = new Scanner(System.in);
        String palindrommu = getdizi.nextLine();
        int uzunluk = palindrommu.length();
        if (uzunluk % 2 ==1){
            for (int i = 0 ;i<((uzunluk-1)/2);i++){
                if (palindrommu.charAt(i) == palindrommu.charAt(uzunluk-i-1)){
                    continue;
                }
                else {
                    flag = 1;
                    break;
                }
            }
        }
        else if (uzunluk % 2 == 0) {
            for (int i = 0; i<uzunluk/2;i++){
                if (palindrommu.charAt(i) == palindrommu.charAt(uzunluk-i-1)){
                    continue;
                }
                else {
                    flag = 1;
                    break;
                }

            }

        }
        if (flag == 0){
            System.out.println("Bu dizi palindrom");
        }
        else {
            System.out.println("Bu dizi palindrom değil");
        }


    }
}
