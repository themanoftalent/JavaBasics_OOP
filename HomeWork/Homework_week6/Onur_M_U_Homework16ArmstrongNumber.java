public class Onur_M_U_Homework16ArmstrongNumber {
    public static void main(String[] args) {
        int number = 153;

        if (isArmstrong(number)) {
            System.out.println(number + " Bu Bir Armstrong Sayıdır.");
        } else {
            System.out.println(number + " Bu Bir Armstrong Sayı Değildir.");
        }
    }

    public static boolean isArmstrong(int number) {
        int originalNumber = number;
        int result = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            result += Math.pow(digit, n);
            number /= 10;
        }

        return originalNumber == result;
    }
}