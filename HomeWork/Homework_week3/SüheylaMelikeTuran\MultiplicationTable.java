import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Sayı giriniz");
        int i=hafıza.nextInt();
        for (int k=1; k<=10; k++){
            int çarpım=i;
            çarpım*=k;
            System.out.println(+i +"*" +k + "=" +çarpım);
        }
    }
}
