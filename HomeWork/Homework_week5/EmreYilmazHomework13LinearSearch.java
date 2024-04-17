import java.util.Scanner;

public class EmreYilmazHomework13LinearSearch {
    public static void main(String[] args) {
        int j = 0;
        boolean varmi = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dizinizin eleman sayısını giriniz: ");
        int terim = sc.nextInt();

        int[] numbers = new int[terim];

        for(int i = 0; i < terim ; i++){
            System.out.println("Elemanları giriniz:");
            int eleman = sc.nextInt();
            numbers[i] = eleman;
        }
        System.out.println("Aranacak elemanı giriniz: ");
        int arananeleman = sc.nextInt();

        for(int i = 0; i<terim; i++){
            if(numbers[i] == arananeleman) {
                varmi = true;
                j = i;
            }

        }
        if(varmi) System.out.println("ARadığınız eleman bulunuyor. Bu sırada: "+j);
        else System.out.println("Aradığınız eleman yok.");
    }
}
