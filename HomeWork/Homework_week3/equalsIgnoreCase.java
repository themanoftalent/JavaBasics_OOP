import java.util.Scanner; //Bu sınıf, kullanıcıdan girdi almak için kullanılır.

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please, enter your name: ");
        String name = input.nextLine();
        System.out.print("Please, enter your surname: ");
        String surname = input.nextLine();

        if(name.equalsIgnoreCase("Guller") && surname.equalsIgnoreCase("Kalyoncu")){
            System.out.println("Correct!");
        }
        //equalsIgnoreCase() metodu iki dizgeyi büyük-küçük harf farklarını yok sayarak karşılaştırır.
        else{
            System.out.println("Unfortunately, you are not the person we are looking for!");
        }



    }
}
