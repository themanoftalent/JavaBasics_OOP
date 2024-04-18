import java.util.Scanner;
public class Odev9 {
    public static void main(String[] args) {
        int flag = 0;
        Scanner getsayi = new Scanner(System.in);
        int sayikontrol = getsayi.nextInt();
        if (sayikontrol == 1){
            System.out.println("Asal Değil");
        }
        if (sayikontrol == 2 ){
            System.out.println("Sayı Asal");
        }
        for (int i = 2; i< sayikontrol;i++){
            if (sayikontrol % i == 0){
                flag = 0;
                break;
            }
            else {
                flag =1;
                continue;

            }
        }
        if (flag == 0){
            System.out.println("Asal Değil");
        }
        else {
            System.out.println("Sayı Asal");
        }
    }
}
