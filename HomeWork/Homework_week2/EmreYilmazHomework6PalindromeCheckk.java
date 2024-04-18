import java.util.Scanner;

public class EmreYilmazHomework6PalindromeCheckk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bir kelime giriniz: ");
        String kelime = sc.nextLine();
        String terskelime = "";

        for(int i = kelime.length()-1;i>=0;i--){
            terskelime = terskelime + kelime.charAt(i);
        }

        if (kelime.equals(terskelime)) System.out.println("palindrom kelimedir.");
        else System.out.println("Palindrom kelime değildir.");

        }
    }

