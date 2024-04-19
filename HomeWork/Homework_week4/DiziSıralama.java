import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int temp=0;
        System.out.println("sıralamak istediğiniz bir dizi olusturunuz");
        System.out.println("dizininiz kac karakterden oluşacagını giriniz");
        int adet=input.nextInt();
        int[] SayiDizisi=new int[adet];


        for (int a=0;a<adet;a++){
            System.out.println(a+1+".terimi giriniz");
            SayiDizisi[a]=input.nextInt();

    }

        for(int b=0;b<adet-1;b++){
            for(int c=0;c<adet-b-1;c++){
                if(SayiDizisi[c]>SayiDizisi[c+1]){
                    temp=SayiDizisi[c+1];

                    SayiDizisi[c+1]=SayiDizisi[c];
                    SayiDizisi[c]=temp;


            }
        }}
        System.out.println("sıralanmıs diziniz = ");
        for(int d=0;d<adet;d++){

            System.out.print(SayiDizisi[d]+" ");
        }

    }
}