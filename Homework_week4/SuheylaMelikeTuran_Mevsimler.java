import java.util.Scanner;

public class Aylar {
    public static void main(String[]args){
        Scanner hafıza=new Scanner(System.in);
        System.out.println("Ayı giriniz");
        String ay=hafıza.nextLine();
        switch (ay){
            case "Ocak","ocak":
                System.out.println("KIŞ");
                break;
            case "Şubat","şubat":
                System.out.println("KIŞ");
                break;
            case "Mart","mart":
                System.out.println("İLKBAHAR");
                break;
            case "Nisan","nisan":
                System.out.println("İLKBAHAR");
                break;
            case "Mayıs","mayıs":
                System.out.println("İLKBAHAR");
                break;
            case "Haziran","haziran":
                System.out.println("YAZ");
                break;
            case "Temmuz","temmuz":
                System.out.println("YAZ");
                break;
            case "Ağustos","ağustos":
                System.out.println("YAZ");
                break;
            case "Eylül","eylül":
                System.out.println("SONBAHAR");
                break;
            case "Ekim","ekim":
                System.out.println("SONBAHAR");
                break;
            case "Kasım","kasım":
                System.out.println("SONBAHAR");
                break;
            case "Aralık","aralık":
                System.out.println("KIŞ");
                break;
            default:
                System.out.println("HATA");
        }

    }
}
