import java.util.Arrays;

public class Muhammed_Nebi_Altın_Assignment12 {

    static void BubbleSort(int[] A){
        for (int i = 0; i < A.length; i++){
            for (int j = 0; j < A.length - i - 1; j++){
                if (A[j] > A[j + 1]){
                    int tmp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = tmp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int[] arr = {5,1,2,9,4,7,0,12};

        System.out.println(Arrays.toString(arr));
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
