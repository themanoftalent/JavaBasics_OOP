import java.io.*;

public class GurhanK_week6_FileReadingAndWriting {
    public static void main(String[] args) throws IOException {

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("GurhanK_week6_FileReadingAndWriting_output.txt"));
            writer.write("Gürhan"); // dosyaya yazılan yazı
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("GurhanK_week6_FileReadingAndWriting_output.txt"));
            System.out.println(reader.readLine());
        }
        catch(IOException e){
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("GurhanK_week6_FileReadingAndWriting_output.txt"));
            writer.write("Gürhan Kaya"); // dosyaya yazılan yazı
            writer.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("GurhanK_week6_FileReadingAndWriting_output.txt"));
            System.out.println(reader.readLine());
        }
        catch(IOException e){
            e.printStackTrace();
        }


    }
}
