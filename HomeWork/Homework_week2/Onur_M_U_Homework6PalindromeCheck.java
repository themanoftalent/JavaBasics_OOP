import java.util.Scanner;
public class  Onur_M_U_Homework6PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String kelime;
        String reversekelime="";

        System.out.print("metin girin : ");
        kelime = scanner.nextLine();

        int boy =  kelime.length();
        for(int i=boy-1; i>=0; i--)
        {
            reversekelime += kelime.charAt(i);
        }

        if(kelime.equals(reversekelime))
            System.out.println(kelime + " palindromik kelimedir");
        else
            System.out.println(kelime + " palindromik kelime degildir");

    }
}