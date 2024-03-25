import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int note1, note2, note3, note4, note5;
        Scanner input = new Scanner(System.in);
        System.out.print("First note: ");
        note1 = input.nextInt();
        System.out.print("Second note: ");
        note2 = input.nextInt();
        System.out.print("Third note: ");
        note3 = input.nextInt();
        System.out.print("Fourth note: ");
        note4 = input.nextInt();
        System.out.print("Fifth note: ");
        note5 = input.nextInt();
        float ortalama = (float) ((note1 + note2 + note3 + note4 + note5) / 5.0);

        if (ortalama >= 90) {
            System.out.println("AA ile geçti");
        } else if (ortalama >= 80) {
            System.out.println("AB ile geçti");
        } else if (ortalama >= 50) {
            System.out.println("DD ile geçti");
        } else {
            System.out.println("FF ile kaldı");
        }
    }
}