import java.util.Scanner;

public class FurkanEceHw2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Hesap makinesine hosgeldiniz");
        System.out.println("Lutfen yapilacak olan islemi seciniz:");
        System.out.println("1-Toplama \n2-Cikarma \n3-Bolme \n4-Carpma");
        
        int choice = in.nextInt();

        System.out.println("Islem yapilacak ilk sayiyi giriniz:");
        int number1 = in.nextInt();
        System.out.println("Islem yapilacak ikinci sayiyi giriniz:");
        int number2 = in.nextInt();

        switch(choice){
            case 1:
            int answer = number1 + number2;
            System.out.println("Isleminizin sonucu:" + answer);
            break;

            case 2:
            answer = number1 - number2;
            System.out.println("Isleminizin sonucu:" + answer);
            break;

            case 3:{
                if (number2 == 0){
                    System.out.println("Bolen 0 olamaz");
                    break;
                }
                else
                    answer =number1 /number2;
                    System.out.println("Isleminizin sonucu:" + answer);
                    break;
            }
            case 4:
            answer = number1 * number2;
            System.out.println("Isleminizin sonucu:" + answer);
            break;
        }
    }
}