// Zeynep Işıl Pelit 2311502220
//Faktöriyel

import java.util.*;
public class isilpelit4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("bir sayi girin:");
        int sayi=scanner.nextInt();
        int faktoriyel=1;
        for(int i=1;i<=sayi;i++) {
            faktoriyel *= i;
        }
        System.out.println(sayi+"sayinin faktoriyeli:"+faktoriyel);
    }

}