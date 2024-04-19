//2311502210
//File Reading and Writing

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class File {
    public static void main(String[] args) {
        CreateFile();
        WriteFile();
        ReadFile();
    }

    public static void CreateFile() {
        File dosya = new File("C:\\User\\Desktop");
        try {
            if (dosya.createNewFile()) {
                System.out.println("File created.");
            } else {
                System.out.println("File is already exist.");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        public static void WriteFile () {
            try {
                BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\merve\\yapılacaklar\\malzemeler.txt", true));
                writer.write("Text\n");
                writer.close();
                System.out.println("File wrote.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void ReadFile () {
            try {
                File dosya = new File("C:\\User\\New");
                Scanner oku = new Scanner(dosya);
                System.out.println("Dosya İçeriği:");
                while (oku.hasNextLine()) {
                    String line = oku.nextLine();
                    System.out.println(line);
                }
                oku.close();
            } 
            catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
