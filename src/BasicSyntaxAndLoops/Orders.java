package BasicSyntaxAndLoops;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOrders = Integer.parseInt(scanner.nextLine());

        double money = 0;

        for (int order = 1; order <= countOrders; order++) {

            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int daysInMonth = Integer.parseInt(scanner.nextLine());
            int capsulesCount = Integer.parseInt(scanner.nextLine());

            double priceForOrders = ((daysInMonth * capsulesCount) * pricePerCapsule);
            money += priceForOrders;

            System.out.printf("The price for the coffee is: $%.2f%n", priceForOrders);
        }
        System.out.printf("Total: $%.2f", money);


    }
}
