package hafta7;

public class SumeyyeElginMutliThreadErrorCozum {
    public static void main(String[] args) {
        Thread is_parcacagi = new Thread(); {
            System.out.println("hello thread");
        }
        is_parcacagi.start();
    }
}
