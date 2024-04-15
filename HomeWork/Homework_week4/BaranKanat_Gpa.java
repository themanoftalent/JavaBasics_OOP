import java.util.Scanner;
public class BaranKanat_Gpa{
    public static void main(String[] args) {
        int not1,not2,not3,not4,not5;
        Scanner scanner = new Scanner(System.in);
        not1= scanner.nextInt();
        not2 = scanner.nextInt();
        not3 = scanner.nextInt();
        not4= scanner.nextInt();
        not5 = scanner.nextInt();
        int toplam = not1+not2+not3+not4+not5;
        double ort = toplam/5;
        int flag = 0;
        if (ort >=50){
            flag=1;
        }

        switch (flag){
            case 1:
                System.out.println("Sınıftan Geçti");
                break;
            case 0:
                System.out.println("Sınıfta Kaldı");
                break;

        }

    }
}
