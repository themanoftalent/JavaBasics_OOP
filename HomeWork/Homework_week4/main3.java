import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir sayi girin:");
        int sayi=scanner.nextInt();

            switch(sayi) {
                             case 12 :
                             case 1 :
                             case 2:
                            System.out.println("kiş mevsimi");
                         break;
                case 3 :
                case 4 :
                case 5 :
                    System.out.println("ilkbahar mevsimi");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("yaz mevsimi");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("sonbahar mevsimi");
                    break;
            }
    }
}
