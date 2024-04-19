public class FurkanEceHw10 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int[] reverseArray = new int[array.length];

        for (int i = 0, j = array.length - 1; i < array.length; i++, j--) {
            reverseArray[i] = array[j];
        }

        System.out.println("Baslangic dizisi:");
        printArray(array);

        System.out.println("Ters cevrilmis:");
        printArray(reverseArray);
    }

    public static void printArray(int[] arry) {
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }
        System.out.println(" ");
    }
}