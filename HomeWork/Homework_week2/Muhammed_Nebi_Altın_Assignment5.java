public class Muhammed_Nebi_Altın_Assignment5 {
    static int fibonacci(int in){
        int i = 0;
        int j = 1;
        for (int x = 1; x < in; x++){
            int tmp = j;
            j = j + i;
            i = tmp;
        }

        // ilk fibonacci değerinin 0 olduğu varsayılarak yapılmıştır (eğer 1'den başlayacaksa j return edilir)
        return i;
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
    }
}
