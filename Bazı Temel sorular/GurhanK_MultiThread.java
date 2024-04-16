public class GurhanK_MultiThread {
    public static void main(String[] args) {
        Thread is_parcacigi = new Thread();
        {
            System.out.println("Hello Thread");
        };

        is_parcacigi.start();
    }
}
