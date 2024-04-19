public class NgHomework8 {
    public static void main(String[] args){
        int satir=10;
        int sutun=10;
        System.out.println("carpim tablosu:");

        System.out.println("   ");

        for(int j=1;j<=satir;j++){
            System.out.printf("%4d", j);

        }
        System.out.printf("%n----------------------------------------%n");


        for(int i=1;i<=satir;i++){
            System.out.printf("%2d|", i);

            for(int j=1;j<=sutun;j++){
                System.out.printf("%4d" , i*j);
            }
            System.out.println( );

        }

    }
}
