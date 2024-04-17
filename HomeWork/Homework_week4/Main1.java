// kaan şahin 2311502223
import java.util.*;

public class Main1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)
    {
        String ay;
        int x=0;

        System.out.println("hangi aydasiniz:");
        ay=input.next();
    if(ay.equals("ocak")||ay.equals("aralik")||ay.equals("subat"))
        x=1;
    if(ay.equals("mart")||ay.equals("nisan")||ay.equals("mayis"))
        x=2 ;
    if(ay.equals("haziran")||ay.equals("temmuz")||ay.equals("agustos"))
        x=3;
    if(ay.equals("eylul")||ay.equals("ekim")||ay.equals("kasim"))
        x=4;
    switch (x){
        case 1:
            System.out.println("kiş");
            break;
        case 2:
            System.out.println("ilkbahar");
            break;
        case 3:
            System.out.println("yaz");
            break;
        case 4:
            System.out.println("sonbahar");
            break;



    }

    }

}