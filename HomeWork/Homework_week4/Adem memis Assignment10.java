import java.util.Scanner;
public class Ders {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir cümle giriniz:");
        String terscevir = input.nextLine();
        String yenikelime = "";

        for(int i = terscevir.length()-1;i>=0;i--){
            yenikelime = yenikelime + terscevir.charAt(i);
        }
        System.out.println(yenikelime);
    }
}
