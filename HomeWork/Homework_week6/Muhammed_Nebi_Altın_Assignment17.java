import java.io.*;
import java.util.ArrayList;

public class Muhammed_Nebi_Altın_Assignment17 {
    public static void main(String[] args) throws IOException {

        // Masaüstündeki text dosyayısını okur içindeki veriyi bir string listesine kaydeder ve bu dosyanın çıktısını konsola yazdırır
        FileReader fr = new FileReader("C:\\Users\\muham\\Desktop\\Deneme.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();
        ArrayList<String> stringList = new ArrayList<>();
        while (line != null)
        {
            stringList.add(line);
            System.out.println(line);
            line = br.readLine();
        }

        // Listedeki bütün karakterleri asterisk (*) ile değiştirir ve bunu dosyaya geri yazdırır
        BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\muham\\Desktop\\Deneme.txt"));
        for (int i = 0; i < stringList.size(); i++){
            String lineText = "";
            for (int j = 0; j < stringList.get(i).length(); j++){
                if (stringList.get(i).charAt(j) != ' '){
                    lineText += "*";
                }
                else
                    lineText += stringList.get(i).charAt(j);
            }
            bw.write(lineText);
            bw.newLine();
        }
        bw.close();

        // düzenlenmiş dosyayı tekrardan okur ve bunu konsola yazdırır
        fr = new FileReader("C:\\Users\\muham\\Desktop\\Deneme.txt");
        br = new BufferedReader(fr);
        line = br.readLine();
        while (line != null)
        {
            System.out.println(line);
            line = br.readLine();
        }
    }

}
