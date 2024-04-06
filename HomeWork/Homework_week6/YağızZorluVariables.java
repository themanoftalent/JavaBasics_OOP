package Week6;

public class YağızZorluVariables {
    public int sayi = 5;
    public double number2 = 3.15;
    public char letter = 'Y';            //Bunları public static void main içine yazamayız dışına yazabiliriz.
                                         //İçine koyarsak sadece o sınıf kullanabilir anlamına gelir.
    public boolean isProgFun = true;

    public double Toplam(int sayi, double number2) {
        double toplam = sayi + number2;
        System.out.println(toplam);
        return toplam;
    }
}

//public static void main içine bunları yazarsak başlarındaki publicleri kaldırmamız gerekir.
//Ör: int sayi = 5;