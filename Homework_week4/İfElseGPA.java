import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ders sayınızı giriniz: ");
        int dersSayisi = input.nextInt();

        float notToplami = 0;

        for(int i = 1; i < dersSayisi+1; i++){
            System.out.print("Ders " + i + " notunuzu giriniz: ");
            float not = input.nextFloat();
            notToplami += not;
        }

        float GPA = notToplami / dersSayisi;

        System.out.println("Ders Ortalamanız: " + GPA);

        if(GPA>=50){
            System.out.println("Tebrikler Geçtiniz!");
        }
        else if (GPA<50 && GPA>45) {
            System.out.println("Şartlı Geçtiniz!");

        }
        else{
            System.out.println("Kaldınız!");
        }


    }
}
