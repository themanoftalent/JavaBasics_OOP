public class MyDriveEmreYilmaz {
    public static void main(String[] args) {
        MyEmreYilmaz my = new MyEmreYilmaz();

        my.age = my.today-my.bhirtday;
        System.out.println("Ad ve soyadı: "+ my.name + " " + my.surname);
        System.out.println("Yaşı: "+my.age);
        System.out.println("Saçı: "+my.hair);
        System.out.println("Kilo: "+my.kilo);
        System.out.println("Boyu: "+my.height);
        System.out.println("Üniversite: "+my.univ);
        if(my.sakal){
            System.out.println("sakalı var.");
        }
        else{
            System.out.println("Sakalı yok.");
        }
        if(my.bıyık){
            System.out.println("Bıyığı var");
        }
        else{
            System.out.println("Bıyığı yok.");
        }
        System.out.println("Hobi: "+my.hobby);
    }
}
