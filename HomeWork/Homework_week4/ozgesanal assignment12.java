//2311502210
//Array Sorting

public class Main{
    public static void main(String[] args) {
        int[] array = {3,5,2,9,4};
        int temp=0;

        System.out.println("Orijinal array: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }

        for(int i=0; i<array.length; i++){
            for(int j=i+1; j< array.length; j++){
                if(array[j]<array[i]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println("Sorted array: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]+" ");
        }
    }
}
