//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String Str = "BURCİN";
        char[] charStr = Str.toCharArray();
        tersi(charStr);
        String tersdStr = new String(charStr);
        System.out.println("BURCİN yazısının tersten yazılısı: " + tersdStr);
    }
        public static void tersi ( char[] charStr){
            int sol = 0;
            int sag = charStr.length - 1;

            while (sol < sag) {
                char a = charStr[sol];
                charStr[sol] = charStr[sag];
                charStr[sag] = a;
                sol++;
                sag--;
            }
        }
}