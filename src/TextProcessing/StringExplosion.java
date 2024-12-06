package TextProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder textBuilder = new StringBuilder(input);

        int totalStrengthOfExplosion = 0;

        for (int position = 0; position < textBuilder.length(); position++) {
            char currentSymbol = textBuilder.charAt(position);

            if (currentSymbol == '>') {
                int explosionStrength = Integer.parseInt (textBuilder.charAt(position + 1) + "");
                totalStrengthOfExplosion += explosionStrength;
            } else if (totalStrengthOfExplosion > 0) {

                textBuilder.deleteCharAt(position);
                totalStrengthOfExplosion--;
                position--;
            }

        }

        System.out.println(textBuilder);

    }
}
