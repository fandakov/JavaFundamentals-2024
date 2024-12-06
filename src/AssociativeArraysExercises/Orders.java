package AssociativeArraysExercises;

import java.util.Dictionary;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Double> productsPrice = new LinkedHashMap<>();
        Map<String, Integer> productsQuantity = new LinkedHashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("buy")) {

            String productName = input.split(" ")[0];
            double productPrice = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);

            if (!productsQuantity.containsKey(productName)) {
                productsQuantity.put(productName, quantity);
            } else {
                int currentQuantity = productsQuantity.get(productName);
                productsQuantity.put(productName, currentQuantity + quantity);
            }

            productsPrice.put(productName,productPrice);

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Double> entry : productsPrice.entrySet()) {

            String productName = entry.getKey();
            double price = entry.getValue();
            int quantity = productsQuantity.get(productName);

            double totalPrice = price * quantity;
            System.out.printf("%s -> %.2f%n", productName,totalPrice);

        }


    }
}
