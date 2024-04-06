public class MainDrive {
    public static void main(String[] args) {
        // MyClass sınıfından bir nesne oluştur
        MyClass myObject = new MyClass();

        // MyClass'taki değişkenlere erişip değerlerini yazdır
        System.out.println("İsim: " + myObject.isim);
        System.out.println("Soyisim: " + myObject.soyisim);
        System.out.println("Yaş: " + myObject.yaş);
        System.out.println("Doğum Tarihi: " + myObject.doğumTarihi);
        System.out.println("Saç Rengi: " + myObject.saçRengi);
        System.out.println("Boy: " + myObject.boy);
        System.out.println("Kilo: " + myObject.kilo);
        System.out.println("Bölüm: " + myObject.bolum);

    }
}