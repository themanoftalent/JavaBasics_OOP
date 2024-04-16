
public class talha {
    public static void main(String[] args) {
        // dizi oluştur ve heap belleğine yazdırsın
        int[] numbers =new int[5];

        //numbers dizisine elemanları atayalım
        for(int i=0;i<numbers.length;i++){
            numbers[i]=i*10;
        }
        System.out.println("numbers dizisi içerigi ");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }

    }
}