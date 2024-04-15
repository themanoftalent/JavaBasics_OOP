public class MultiThreadingMuhammedNebiAltın {

    public static void main(String[] args) {

        //yeni bir thread (iş parçacığı)
        Thread is_parcacigi = new Thread(() -> {
            System.out.println("Hello Thread");
        });
        is_parcacigi.start();
    }
}

