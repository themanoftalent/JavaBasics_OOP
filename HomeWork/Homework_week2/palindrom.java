package ödev6;

import java.util.Scanner;

class palindrom {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bir kelime veya cümle girin:");
        String input = scanner.nextLine();

        String lowercaseInput = input.toLowerCase();

        String cleanedInput = lowercaseInput.replaceAll("[^a-zA-Z0-9]", "");

        boolean isPalindrome = true;

        int i = 0;
        int j = cleanedInput.length() - 1;
        while (i < j) {
            if (cleanedInput.charAt(i) != cleanedInput.charAt(j)) {
                isPalindrome = false;
                break;
            }
            i++;
            j--;
        }

        if (isPalindrome) {
            System.out.println(input + " bir palindromdur.");
        } else {
            System.out.println(input + " bir palindrom değildir.");
        }

        scanner.close();
	}

}
//Emiralp Yakalı 2311502251