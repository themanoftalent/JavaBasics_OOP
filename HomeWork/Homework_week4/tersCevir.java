package ödev10;

import java.util.Scanner;

class tersCevir {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin girin:");
        String input = scanner.nextLine();

        String reversedString = reverse(input);

        System.out.println("Tersine çevrilmiş metin: " + reversedString);

        scanner.close();
    }

    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }

        return reversed.toString();

	}

}
//Emiralp Yakalı 2311502251