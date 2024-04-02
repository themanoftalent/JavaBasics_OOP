import java.util.*;
public class Maingpa {

    static Scanner input =new Scanner(System.in);
    public static void main(String[] args) {

        float grade1 ,gpa = 0;
        for(int i=0;i<5;i++) {
            System.out.println("Not giriniz:");
            grade1 = input.nextFloat();
            gpa = (int) (gpa + grade1);
        }

       gpa=gpa/5;

        int result = 0;

        if (gpa >= 50)
            result = 1;

        switch (result){

            case 1:
                System.out.println("Geçtin!");
                break;

            case 0:
                System.out.println("Kaldın!");
                break;
    }

}


}