// Arda Göktaş 2311502241
import java.util.*;
public class MultiplicationTableArdaGoktas {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        for(int i=1; i<=10; i++){
            for(int j=1; j<=10; j++){
                System.out.print(i + "*" + j+ "="+ i*j);
                System.out.print("\t");
            }
            System.out.println("");
        }
    }
}
