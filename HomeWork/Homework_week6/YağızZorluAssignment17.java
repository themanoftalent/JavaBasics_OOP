package Assignments;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

    public class YağızZorluAssignment17 {
        public static void main(String[] args) {
            String inputFile = "input.txt";
            String outputFile = "output.txt";

            try {
                Scanner scanner = new Scanner(new File(inputFile));
                FileWriter writer = new FileWriter(new File(outputFile));

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();

                    String[] parts = line.split(" ");
                    StringBuilder modifiedLine = new StringBuilder();
                    for (int i = 0; i < parts.length; i++) {
                        int number = Integer.parseInt(parts[i]);
                        modifiedLine.append(number * 2);
                        if (i != parts.length - 1) {
                            modifiedLine.append(" ");
                        }
                    }

                    writer.write(modifiedLine.toString() + "\n");
                }
                System.out.println("İşlem tamamlandı. Sonuçlar \"" + outputFile + "\" dosyasına yazıldı.");
            } catch (IOException e) {
                System.out.println("Dosya işlemleri sırasında bir hata oluştu: " + e.getMessage());
            }
        }
    }
