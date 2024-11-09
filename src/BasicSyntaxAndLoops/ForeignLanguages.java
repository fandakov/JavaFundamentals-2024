package BasicSyntaxAndLoops;

import java.util.Scanner;

public class ForeignLanguages {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();


        String language = switch (country) {
            case "Usa", "England" -> "English";
            case "Spain", "Argentina", "Mexico" -> "Spanish";
            default -> "unknown";
        };
        System.out.println(language);

    }
}

