import java.util.Scanner;

public class EmreYilmazHomework10ReverseaStringg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cümlenizi giriniz: ");
        String cumle = sc.nextLine();
        String yenicumle = " ";

        for(int i = cumle.length()-1;i>=0;i--){
            yenicumle = yenicumle + cumle.charAt(i);
        }
        System.out.println(yenicumle);
    }
}
