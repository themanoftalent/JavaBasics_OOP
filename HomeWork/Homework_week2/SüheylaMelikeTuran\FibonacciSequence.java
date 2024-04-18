public class FibonacciSequence {
    public static void main(String[]args){
        // 10. terime kadar olan fibonacci dizisini yazdıran program.
        int a1=0;
        int a2=1;
        for (int i=0; i<10; i++){
            int fibonacci=0;
            if (i % 2 == 0) {
                fibonacci=a1+a2;
                a1=fibonacci;
                System.out.println(fibonacci);
            }
            else {
                fibonacci=a1+a2;
                a2=fibonacci;
                System.out.println(fibonacci);
            }
        }
    }
}
