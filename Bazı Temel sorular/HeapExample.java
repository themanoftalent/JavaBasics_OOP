public class HeapExample {
    public static void main(String[] args) {
        int [] number = new int [5];

        for (int i = 0; i<number.length; i++){
            number[i] = i*10;
        }
        System.out.println("Number dizi içeriği: ");

        for(int i = 0; i<number.length; i++){
            System.out.println(number[i]);
        }
    }
}
