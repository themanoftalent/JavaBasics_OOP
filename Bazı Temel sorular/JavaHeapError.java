public class HeapExample {
    public static void main(String[] args) {
        // dizi ve dizi heap belleğine yazdırsın
        int[] numbers = new int[5];

        // numbers dizisine elemanları atayalım

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        System.out.println("Numbers dizisi içeriği");
    // hata :    System.out.println(numbers);
  System.out.println(numbers[0]);
		        //dizi olduğu için içeriğini belli etmemiz gerekiyor. numbers diye bir şey tanımlanmadı
    }

}
