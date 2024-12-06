package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regexUser = "[A-za-z0-9]+[\\.\\-\\_]?[A-za-z0-9]+";
        String regexHost = "[A-za-z]+\\-?[A-za-z]+(\\.[A-za-z]+\\-?[A-za-z]*)+";

        String regexEmail = regexUser + "@" + regexHost;

        Pattern pattern = Pattern.compile(regexEmail);
        Matcher matcher = pattern.matcher(input);


        while (matcher.find()) {
            System.out.println(matcher.group());
        }

    }
}
