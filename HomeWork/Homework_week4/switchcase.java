import java.util.Scanner;
public class switchcase {
    public static void main(String[]args){

        Scanner a= new Scanner(System.in);
        System.out.println("1.Not giriniz.");
        int not1= a.nextInt();
        System.out.println("2.Not giriniz.");
        int not2= a.nextInt();
        System.out.println("3.Not giriniz.");
        int not3= a.nextInt();
        System.out.println("4.Not giriniz.");
        int not4= a.nextInt();
        System.out.println("5.Not giriniz.");
        int not5= a.nextInt();
         int ort= (not1+not2+not3+not4+not5)/5;
          System.out.println("ortalama="+ort);

          switch (ort){
              case 50:
                  System.out.println("sınırdasın");
                  break;
              case 30:
                  System.out.println("kaldın");
                  break;

              case 70:
                  System.out.println("geçtin");
                  break;
              default:
                  System.out.println("tanımlı değil");
          }
    }

}

