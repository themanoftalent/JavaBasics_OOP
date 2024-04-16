import java.util.Arrays;

public class EmreYilmazHomework8MultiplicationTable {
    public static void main(String[] args) {
        int[][] dizi = new int[10][10];

        for(int i = 0; i<10;i++){
            for(int j = 0; j<10; j++){
                dizi[i][j] = i * j;
            }
        }
        for(int i = 0; i<10;i++){
            System.out.println(Arrays.toString(dizi[i]));
        }
    }
}
