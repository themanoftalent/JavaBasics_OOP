//kadergüneş
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double ders1,ders2,ders3,ders4,ders5,ort;
        double total=0;
        System.out.println("birinci dersin notunu giriniz:");
        ders1=input.nextDouble();
        total+=ders1;
        System.out.println("ikinci dersin notunu giriniz:");
        ders2=input.nextDouble();
        total+=ders2;
        System.out.println("üçüncü dersin notunu girin");
        ders3=input.nextDouble();
        total+=ders3;
        System.out.println("dördüncü dersin notunu girin:");
        ders4=input.nextDouble();
        total+=ders4;
        System.out.println("beşinci dersin notunu girin:");
        ders5=input.nextDouble();
        total+=ders5;
        ort=total/5;

        if(ort>50){
            System.out.println("geçti");
        }
        else{
            System.out.println("kaldı");
        }

    }
}
