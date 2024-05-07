import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Onur_M_U_Homework17FileReadWrite {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));

            String line;
            while ((line = reader.readLine()) != null) {

                String modifiedLine = line.replaceAll("x", "y");

                writer.write(modifiedLine);
                writer.newLine();
            }
            
            reader.close();
            writer.close();

            System.out.println("Dosya başarıyla işlendi.");
        } catch (IOException e) {
            System.out.println("Dosya işleme hatası: " + e.getMessage());
        }
    }
}
