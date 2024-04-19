//Bekir kaan şahin 2311502223
import java.util.*;
public class Assignment15 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];


        for(int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                System.out.println("(Birinci matris)Sayi giriniz "+ i+ "," + j + ":");
                matrix1[i][j] = input.nextInt();
            }
        }


        for(int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                System.out.println("(İkinci matris)Sayi giriniz "+ i+ "," + j + ":");
                matrix2[i][j] = input.nextInt();
            }
        }


        System.out.println("Sonuç matrisi:\n");
        for(int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                System.out.print(matrix1[i][j] + matrix2[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
        System.out.println("");
        for(int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                System.out.print(matrix1[i][j] * matrix2[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}