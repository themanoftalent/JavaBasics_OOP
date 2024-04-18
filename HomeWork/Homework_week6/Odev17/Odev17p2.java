//Burada farklı classtaki veriyi manipüle edicez
public class Odev17p2 {
    public static String[] manipuleet(){
        String[] manipulated = new String[Odev17p1.verilerimiz.length];
        for (int i =0 ; i < Odev17p1.verilerimiz.length; i++){
            manipulated[i] = Odev17p1.verilerimiz[i].toUpperCase();
        }
        return manipulated;
    }
}