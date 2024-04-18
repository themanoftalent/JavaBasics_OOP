//Cihan Eren Karpınar - 2311502273
import java.io.*;

public class CihanAssigment17 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";
        try {
            FileReader reader = new FileReader(inputFile);
            FileWriter writer = new FileWriter(outputFile);
            BufferedReader bufferedReader = new BufferedReader(reader);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String upperCaseLine = line.toUpperCase();
                bufferedWriter.write(upperCaseLine);
                bufferedWriter.newLine();
            }
            bufferedReader.close();
            bufferedWriter.close();
            System.out.println("Data has been read from '" + inputFile + "', manipulated, and written to '" + outputFile + "'.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
