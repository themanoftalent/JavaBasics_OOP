package soru06;

class MultiThread {

    public static void main(String[] args) {
        
        Thread is_parcacigi = new Thread() {
            public void run() {
                System.out.println("Hello Thread");
            }
        };
        is_parcacigi.start();
    }
}



//Emiralp Yakalı 2311502251