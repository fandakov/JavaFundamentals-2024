package MethodsExercise;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (!input.equals("END")) {

            if (checkPalindrome(input)) {
                System.out.println("true");
            }else  {
                System.out.println("false");
            }
            input = scanner.nextLine();
        }
    }

    public static boolean checkPalindrome (String text) {
        String reversedText = "";

        for (int position = text.length() - 1; position >= 0; position--) {
            char currentSymbol = text.charAt(position);
            reversedText += currentSymbol;
        }

        return text.equals(reversedText);

    }
}
