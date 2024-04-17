import java.util.Scanner;
public class yaş {
    public static void main (String args[]){
        Scanner m= new Scanner(System.in);
        System.out.println("yaşınızı giriniz");
        int yaş=m.nextInt();

        switch (yaş){
            case 0:
                System.out.println("bebeksin");
                break;
            case 15:
                System.out.println("gençsin");
                break;
            case 30:
                System.out.println("orta yaşlısın");
                break;
            case 60:
                System.out.println("yaşlanıyorsun");
                break;
            default:
                System.out.println("yaşlısın");

        }
    }// CEYDA ANKARA
}
