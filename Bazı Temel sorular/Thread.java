public class MultiThread {

    public static void main(String[] args) {
        
        //yeni bir thread (iş parçağı) 
        Thread is_parcacigi = new Thread() -> {
            System.out.println("Hello Thread");
        }
        is_parcacigi.start();
    }
}
