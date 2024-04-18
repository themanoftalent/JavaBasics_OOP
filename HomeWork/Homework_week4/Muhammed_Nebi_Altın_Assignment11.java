public class Muhammed_Nebi_Altın_Assignment11 {

    public static void main(String[] args) {

        int[] arr = {2,3,5,7,5,4,6,3,9};

        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        float avrg = (float) sum /arr.length;

        System.out.println("Sum: " + sum);
        System.out.println("Avarage: " + avrg);

    }
}
