package hafta6;

public class SumeyyeElginMyClassDrive {
    public static void main(String[] args) {
        SumeyyeElginMyClass sumeyye = new SumeyyeElginMyClass();

        sumeyye.name = "sümeyye";
        sumeyye.surname = "elgin";
        sumeyye.age = 2024-2002;
        sumeyye.uni = "banü";
        sumeyye.major = "bilgisayar mühendisliği";
        sumeyye.hairColor = "krengi";
        sumeyye.height = 1.63F;
        sumeyye.isBeard = false;
        sumeyye.isMoustache = false;
        sumeyye.hobby = "kitap okuma";


        System.out.println("isim: " + sumeyye.name);
        System.out.println("soy isim: " + sumeyye.surname);
        System.out.println("yaş: " + sumeyye.age);
        System.out.println("üni/bölüm: " + sumeyye.uni + "/" + sumeyye.major);
        System.out.println("saç rengi: " + sumeyye.hairColor);
        System.out.println("boy: " + sumeyye.height);
        System.out.println("bıyık: " + sumeyye.isMoustache);
        System.out.println("sakal: " + sumeyye.isBeard);
        System.out.println("hobisi: " + sumeyye.hobby);
    }
}
