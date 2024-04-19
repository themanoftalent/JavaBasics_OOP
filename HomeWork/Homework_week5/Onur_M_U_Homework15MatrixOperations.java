import java.util.Scanner;

public class Onur_M_U_Homework15MatrixOperations {
    static Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
        int[][] MatrisOne =new int[3][3];
        int [][] MatrisTwo= new int[3][3];
        int [][] ProductMatris=new int[3][3];
        int [][] SumMatris=new int[3][3];
        for(int a=0;a<3;a++){
            for(int b=0;b<3;b++){
                System.out.println("1. matrisin "+(a+1)+".satır "+(b+1)+".sutun elemanını giriniz");
                MatrisOne[a][b]=input.nextInt();

            }
        }
        for(int c=0;c<3;c++){
            for(int d=0;d<3;d++){
                System.out.println("2. matrisin "+(c+1)+".satır "+(d+1)+".sutun elemanını giriniz");

                MatrisTwo[c][d]=input.nextInt();

            }
        }
        System.out.println("iki matrisin çarpımı = ");
        for(int e=0;e<3;e++){
            for (int f=0;f<3;f++){
                ProductMatris[e][f]=MatrisOne[e][f]*MatrisTwo[e][f];
                System.out.print(ProductMatris[e][f]+" ");
            }
            System.out.println();
        }
        System.out.println("iki matrisin toplamı = ");
        for(int i=0;i<3;i++){

            for (int j=0;j<3;j++){
                SumMatris[i][j]=MatrisOne[i][j]+MatrisTwo[i][j];
                System.out.print(SumMatris[i][j]+" ");
            }
            System.out.println();
        }
    }
}




