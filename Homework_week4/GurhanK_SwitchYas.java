import java.util.Scanner;

public class GurhanK_SwitchYas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yas;

        System.out.print("Lutfen yasinizi giriniz: ");
        yas = scanner.nextInt();

        switch (yas){
            case 0:
                System.out.println("Yeni dogmus!");
                break;
            case 1:
                System.out.println("Bir yasindasiniz");
                break;
            case 5:
                System.out.println("Bes yasindasiniz");
                break;
            case 10:
                System.out.println("On yasindasiniz");
                break;
            case 15:
                System.out.println("On bes yasindasiniz");
                break;
            case 20:
                System.out.println("Yirmi yasindasiniz");
                break;
            default:
                System.out.println("Yaslanmissiniz");
        }
    }
}
