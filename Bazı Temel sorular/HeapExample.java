
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

package hafta7;

public class HeapExample {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        //numbrs dizisine eleman atayalım.
        for(int i=0;i<numbers.length;i++){
            numbers[i]=i*10;
        }
        System.out.println("Numbers dizisi içeriği");
        for(int dizi : numbers){
            System.out.println(dizi);
        }

    }
}
//Emre Yılmaz

