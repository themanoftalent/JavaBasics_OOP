import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=1;

        float gpa=0;
        int sum=0;
        int grade;

        while(i<=5){
            System.out.println("Enter your"+i+". grade:");
            grade=s.nextInt();
            sum+=grade;
        }
        gpa=sum/5;

        if (gpa>=80){
            System.out.println("AA");
        }
        else if (gpa>=71){
            System.out.println("BA");
        }
        else if (gpa>=63){
            System.out.println("BB");
        }
        else if (gpa>=55){
            System.out.println("CB");
        }
        else if (gpa>=50){
            System.out.println("CC");
        }
        else if (gpa>=45){
            System.out.println("DC");
        }
        else if (gpa>=35){
            System.out.println("DD");
        }
        else{
            System.out.println("FF");
        }
    }
}
