import java.util.Arrays;

public class Muhammed_Nebi_Altın_Assignment15{

    static int[][] matrixSum(int[][] m1, int[][] m2){
        int size = m1.length;

        int[][] sum = new int[size][size];

        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[][] m1 = {{1, 3, 7},
                      {3, 6, 1},
                      {5, 1, 0}};
        int[][] m2 = {{4, 2, 9},
                      {0, 3, 7},
                      {3, 1, 4}};

        for (int i = 0; i < m1.length ; i++){
            System.out.println(Arrays.toString(m1[i]) + "  +  " + Arrays.toString(m2[i]) + "  =  " + Arrays.toString(matrixSum(m1, m2)[i]));
        }
    }
}
