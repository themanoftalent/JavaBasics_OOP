import java.util.Scanner;

public class Main {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int[][] CarpimToblusu= new int[10][10];
        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                CarpimToblusu[a][b]=(a*10)+b+1;
                System.out.print(CarpimToblusu[a][b]+"  ");

            }
            System.out.println();
        }
    }
}