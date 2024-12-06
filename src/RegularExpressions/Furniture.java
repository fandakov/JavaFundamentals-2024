package RegularExpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>[0-9]+)";
        Pattern regexName = Pattern.compile(regex);

        double totalPrice = 0;
        System.out.println("Bought furniture:");

        while (!input.equals("Purchase")) {

            Matcher matcher = regexName.matcher(input);

            if (matcher.find()) {

                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                System.out.println(furnitureName);

                totalPrice += price * quantity;
            }


            input = scanner.nextLine();
        }

        System.out.printf("Total money spend: %.2f", totalPrice);
    }
}
