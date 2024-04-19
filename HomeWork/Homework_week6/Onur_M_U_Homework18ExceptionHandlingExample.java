public class Onur_M_U_Homework18ExceptionHandlingExample {
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = divide(dividend, divisor);
            System.out.println("Bölme sonucu: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme hatası (" + e.getMessage() + ")");
        }
    }

    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Sıfıra bölme hatası: Bölen sıfır olamaz.");
        }
        return dividend / divisor;
    }
}
