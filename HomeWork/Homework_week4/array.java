package array;
import java.util.Arrays;
public class array {

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
	        int[] arr = {6,1,20,9,8,3,0,17};

	        System.out.println(Arrays.toString(arr));
	        BubbleSort(arr);
	        System.out.println(Arrays.toString(arr));
	    }
	}
