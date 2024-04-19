// Zeynep Işıl Pelit 2311502220
// Matris işlemleri
import java.util.*;
public class isilpelit15 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        int[][] matrix1 = new int[4][4];
        int[][] matrix2 = new int[4][4];

        // inputting matrix1
        for(int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                System.out.println("Please enter "+ i+ "," + j + ":");
                matrix1[i][j] = input.nextInt();
            }
        }

        // inputting matrix2
        for(int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                System.out.println("Please enter "+ i+ "," + j + ":");
                matrix2[i][j] = input.nextInt();
            }
        }

        // printing the result matrix
        System.out.println("The result matrix is:\n");
        for(int i=1; i<4; i++){
            for(int j=1; j<4; j++){
                System.out.print(matrix1[i][j] + matrix2[i][j]);
                System.out.print("\t");
            }
            System.out.println("");
       }
    }
}
