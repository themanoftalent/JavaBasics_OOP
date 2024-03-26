import java.util.*;
public class GecmeKalma {
    public static void main(String[] args) {
        int toplam = 0;
        Scanner sc = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.println("Notunuzu giriniz: ");
            int not = sc.nextInt();
            toplam+=not;
        }
        float ortalama = (float) toplam/5;
        int deneme = (int) ortalama/50;

        switch(deneme){
            case 0:
                System.out.println("Dersten kaldınız.");
                break;
            case 1:
                System.out.println("Dersten geçtiniz.");
                break;
            default:
                System.out.println("yanlış girdiniz.");
                break;




        }

    }
}
