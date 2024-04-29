package hafta6.SumeyyeElginFileReadingAndWriting;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SumeyyeElginFileReadingAndWriting {
    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder(); //okunan içeriği birleştirmek için kullanılacak StringBuilder nesnesi oluşturduk
        try {
            File file = new File(fileName); //okunacak dosya oluşturduk
            Scanner scanner = new Scanner(file); //dosyayı okumak için Scanner nesnesi oluşturduk

            // Dosyadan satır satır okuma yapılır
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n"); //okunan satır StringBuilder nesnesine ekledik
            }
            scanner.close();
        } catch (IOException e) {
            //dosya okuma işlemi sırasında bir hata oluşması durumunda hata mesajını yazdırdık
            System.out.println("Dosya okuma sırasında bir hata oluştu: " + e.getMessage());
        }
        return content.toString();
    }

    public static String modifyContent(String content) {
        //örnek değişiklik olarak dosyamızdaki tüm harfleri büyük harfe dönüştürdük
        return content.toUpperCase(); // içeriği büyük harfe dönüştürülmüş olarak döndürdük
    }

    public static void uploadFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName); //dosyaya yazmak için FileWriter nesnesi oluşturduk
            writer.write(content); //içerik dosyaya aktardık
            writer.close();
            System.out.println("Dosya başarıyla güncellendi.");
        } catch (IOException e) {
            //değişen içeriği dosyaya aktarma işlemi sırasında bir hata oluşursa, hata mesajı yazdırdık
            System.out.println("Dosyaya yazma sırasında bir hata oluştu: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\SÜMEYYE\\Desktop\\opp ödev\\hafta6\\SumeyyeElginFileReadingAndWriting\\dosya.txt"; //işlem yapılacak olan dosyanın adı ve yolu

        //içeriği okuduk
        String fileContent = readFromFile(fileName);

        //içeriği değiştirdik
        String modifiedContent = modifyContent(fileContent);

        //değiştirilmiş içeriği dosyaya aktardık
        uploadFile(fileName, modifiedContent);
    }
}



