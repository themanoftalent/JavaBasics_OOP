package ödev17;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class dosyaOkuYaz {

	public static void main(String[] args) {
		        String inputFile = "input.txt";
		        String outputFile = "output.txt";

		        try {
		            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		            String line;
		            StringBuilder content = new StringBuilder();
		            while ((line = reader.readLine()) != null) {
		                String modifiedLine = modifyLine(line);
		                content.append(modifiedLine).append("\n");
		            }
		            reader.close();

		            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
		            writer.write(content.toString());
		            writer.close();

		            System.out.println("Veriler başarıyla değiştirildi ve " + outputFile + " dosyasına yazıldı.");
		        } catch (IOException e) {
		            System.out.println("Dosya okuma veya yazma hatası: " + e.getMessage());
		        }
		    }

		    public static String modifyLine(String line) {
		        return line;

	}

}
//Emiralp Yakalı 2311502251