import java.util.*;

public class Odev8 {
    public static void main(String[] args) {
        int[][] matris = new int[9][9];
        for (int i =1;i<10;i++){
            for (int j = 1;j<10;j++){
                matris[i-1][j-1] = i*j;
            }
        }
        for (int i =0; i<9;i++){
            for (int j=0;j<9;j++){
                System.out.printf("%4d",matris[i][j]);
            }
            System.out.print("\n");
        }

    }
}
