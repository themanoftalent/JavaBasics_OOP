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
