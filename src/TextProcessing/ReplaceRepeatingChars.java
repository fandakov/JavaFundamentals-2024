package TextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder charRemoving = new StringBuilder(input);

        for (int position = 0; position < charRemoving.length() - 1; position++) {

            if (charRemoving.charAt(position) == charRemoving.charAt(position + 1)) {
                charRemoving.deleteCharAt(position + 1);
                position--;
            }
        }
        System.out.println(charRemoving);
    }
}
