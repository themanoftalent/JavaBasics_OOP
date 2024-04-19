package hafta6.SumeyyeElginFileReadingAndWriting;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SumeyyeElginFileReadingAndWriting {
    public static String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder(); // Okunan içeriği birleştirmek için kullanılacak StringBuilder nesnesi oluşturulur
        try {
            File file = new File(fileName); // Okunacak dosya oluşturulur
            Scanner scanner = new Scanner(file); // Dosyayı okumak için Scanner nesnesi oluşturulur

            // Dosyadan satır satır okuma yapılır
            while (scanner.hasNextLine()) {
                content.append(scanner.nextLine()).append("\n"); // Okunan satır StringBuilder nesnesine eklenir
            }
            scanner.close(); // Scanner nesnesi kapatılır
        } catch (IOException e) {
            // Dosya okuma işlemi sırasında bir hata oluşursa, hata mesajı yazdırılır
            System.out.println("Dosya okuma sırasında bir hata oluştu: " + e.getMessage());
        }
        return content.toString(); // Okunan içerik string olarak döndürülür
    }

    public static String modifyContent(String content) {
        // Örnek değişiklik: Tüm içeriği büyük harfe dönüştürme
        return content.toUpperCase(); // İçeriği büyük harfe dönüştürülmüş olarak döndür
    }

    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName); // Dosyaya yazmak için FileWriter nesnesi oluşturulur
            writer.write(content); // İçerik dosyaya yazılır
            writer.close(); // FileWriter nesnesi kapatılır
            System.out.println("Dosya başarıyla güncellendi."); // İşlem başarıyla tamamlandı mesajı yazdırılır
        } catch (IOException e) {
            // Dosyaya yazma işlemi sırasında bir hata oluşursa, hata mesajı yazdırılır
            System.out.println("Dosyaya yazma sırasında bir hata oluştu: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\SÜMEYYE\\Desktop\\opp ödev\\hafta6\\SumeyyeElginFileReadingAndWriting\\dosya.txt"; // İşlem yapılacak olan dosyanın adı ve yolu

        // Dosyadan içeriği oku
        String fileContent = readFromFile(fileName);

        // İçeriği değiştir
        String modifiedContent = modifyContent(fileContent);

        // Değiştirilmiş içeriği dosyaya yaz
        writeToFile(fileName, modifiedContent);
    }
}



