//2311502210
//Matrix Operations

import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[][] mx1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] mx2 = {{9,8,7},{6,5,4},{3,2,1}};

        int[][] sum = new int[mx1.length][mx1[0].length];
        for (int i=0; i<mx1.length; i++) {
            for (int j=0; j<mx1[0].length; j++) {
                sum[i][j] = mx1[i][j] + mx2[i][j];
            }
        }
        int[][] multiply = new int[mx1.length][mx2[0].length];
        for (int i=0; i<mx1.length; i++) {
            for (int j=0; j<mx2[0].length; j++) {
                for (int k=0; k<mx1[0].length; k++) {
                    multiply[i][j] += mx1[i][k] * mx2[k][j];
                }
            }
        }
        System.out.println("Addition: "+ Arrays.deepToString(sum));
        System.out.println("Multiplication: "+Arrays.deepToString(multiply));
    }
}
