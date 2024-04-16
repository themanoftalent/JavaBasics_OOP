import java.util.Scanner;

public class EmreYilmazHomework2SimpleCalculator {
    public static void main(String[] args) {
        double answer;
        Scanner sc = new Scanner(System.in);
        System.out.println("Birinci sayıyı giriniz: ");
        double number1 = sc.nextDouble();
        System.out.println("ikinci sayıyı giriniz: ");
        double number2 = sc.nextDouble();
        System.out.println("+ , - , * , / 'den birini giriniz: ");
        char islem = sc.next().charAt(0);

        switch(islem){
            case '+':
                answer = number1 + number2;
                System.out.println(answer);
                break;
            case '-':
                answer = number1 - number2;
                System.out.println(answer);
                break;
            case '*':
                answer = number1 * number2;
                System.out.println(answer);
                break;
            case '/':
                if(number2 == 0) System.out.println("Tanımsız.");
                else{
                    answer = number1 / number2;
                    System.out.println(answer);
                }
                break;
            default:
                System.out.println("hatalı işlem girdiniz.");
                break;
        }
    }
}
