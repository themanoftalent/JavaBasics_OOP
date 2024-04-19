package Ödevler6.hafta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//2311502229 Ali Eren Hakut
public class Dosyaokumayazma {

	public static void main(String[] args) {
		try (BufferedReader reader = new BufferedReader(new FileReader("okunacak_dosya.txt"))) {
			String satir;
			while ((satir = reader.readLine()) != null) {
				System.out.println(satir);
			}
		} catch (IOException e) {
			System.err.println("Dosya okunurken bir hata oluştu: " + e.getMessage());
		}

		try (BufferedWriter writer = new BufferedWriter(new FileWriter("yazilacak_dosya.txt"))) {
			writer.write("Bu bir test satırıdır.");
			writer.newLine();
			writer.write("Bu da ikinci bir test satırıdır.");
			System.out.println("Dosyaya yazma işlemi tamamlandı.");
		} catch (IOException e) {
			System.err.println("Dosyaya yazılırken bir hata oluştu: " + e.getMessage());
		}

	}

}
