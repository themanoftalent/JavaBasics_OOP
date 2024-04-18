import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        double islemSonucu=0;
        System.out.println("islem yapmak istediginiz 1. sayiyi giriniz");
        double numberOne=input.nextDouble();
        System.out.println("islem yapmak istediginiz 2. sayiyi giriniz");
        double numberTwo=input.nextDouble();
        System.out.println("bir islem numarası giriniz");
        System.out.println("1=toplama\n" +
                "2=cıkarma\n" +
                "3=bolme\n" +
                "4=carpma\n");
        int islem=input.nextInt();

        switch (islem){
            case 1:{
                islemSonucu=numberTwo+numberOne;
                System.out.println("sonucunuz = " +
                islemSonucu);
                break;

            }
            case 2:{
                islemSonucu=numberOne-numberTwo;
                System.out.println("sonucunuz = " + islemSonucu);
                break;
            }
            case 3:{
                if(numberTwo==0){
                    if(numberOne==0){
                        System.out.println("0 / 0 sonsuzluk hatasi");

                    }
                    else {
                        System.out.println("0 'a bolunme hatasi");
                    }
                  break;
                }
                islemSonucu=numberOne/numberTwo;
                System.out.println(" sonucunuz = " + islemSonucu );

                break;

            }
            case 4:{
                islemSonucu=numberOne*numberTwo;
                System.out.println("sonucunuz = "+islemSonucu);
                break;

            }
            default:{
                System.out.println("hatali islem türü sectiniz");
            }
        }
    }
}