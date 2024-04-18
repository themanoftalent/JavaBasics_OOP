//Burdada manipüle edilmiş verileri yeni dosyamızda yazdırıyoruz
public class Odev17p3 {
    public static void main(String[] args) {
        String[] verininsonhali =  Odev17p2.manipuleet();
        System.out.println("Manipüle edilmiş veriler");
        for (String data : verininsonhali){
            System.out.print(data+ "  ");
        }
    }
}
