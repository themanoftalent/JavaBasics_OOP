
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

package hafta7;

import org.w3c.dom.ls.LSOutput;

public class MultiThread {
    public static void main(String[] args) {
        //yeni bir thread (iş parçacığı)
        Thread is_parcacigi = new Thread(); {
            System.out.println("Hello Thread");
        }
        is_parcacigi.start();
    }
}
                    //Emre Yılmaz

