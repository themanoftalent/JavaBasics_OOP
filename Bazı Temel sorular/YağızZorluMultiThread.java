package Week7;

public class YağızZorluMultiThread {
    public static void main(String[] args) {

        Thread is_parcacigi = new Thread(() -> {
            System.out.println("Hello Thread");
        });
        is_parcacigi.start();
        }
    }

