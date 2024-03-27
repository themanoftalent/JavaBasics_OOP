import java.util.Scanner;

//ortalama hesaplamak//
public class Main {
    static Scanner a = new Scanner(System.in);
    public static void main(String[] args) {

        int toplam=0;

        for(int i=1;i<=5;i++) {

            System.out.println("notlarınızı girin:");
            int not = a.nextInt();

            toplam += not;


        }
        float ortalama=toplam/5;
        System.out.println(ortalama);
    }
}
