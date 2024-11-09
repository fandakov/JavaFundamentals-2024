import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfPeople = Integer.parseInt(scanner.nextLine());
        String groupOfWeek = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double pricePerPerson = 0;

        double totalPrice = pricePerPerson * countOfPeople;
        switch (dayOfWeek) {
            case "Friday":
                if (groupOfWeek.equalsIgnoreCase("students")) {
                    pricePerPerson = 8.45;
                } else if (groupOfWeek.equalsIgnoreCase("business")) {
                    pricePerPerson = 10.90;
                } else if (groupOfWeek.equalsIgnoreCase("regular")) {
                    pricePerPerson = 15;
                }
                break;
            case "Saturday":
                if (groupOfWeek.equalsIgnoreCase("students")) {
                    pricePerPerson = 9.80;
                } else if (groupOfWeek.equalsIgnoreCase("business")) {
                    pricePerPerson = 15.60;
                } else if (groupOfWeek.equalsIgnoreCase("regular")) {
                    pricePerPerson = 20;
                }
                break;
            case "Sunday":
                if (groupOfWeek.equalsIgnoreCase("students")) {
                    pricePerPerson = 10.46;
                } else if (groupOfWeek.equalsIgnoreCase("business")) {
                    pricePerPerson = 16;
                } else if (groupOfWeek.equalsIgnoreCase("regular")) {
                    pricePerPerson = 22.50;
                }
                break;
        }
        totalPrice = pricePerPerson * countOfPeople;

        if (groupOfWeek.equalsIgnoreCase("students") && countOfPeople >= 30) {
            totalPrice *= 0.85;
        } else if (groupOfWeek.equalsIgnoreCase("business") && countOfPeople >= 100) {
            totalPrice -= pricePerPerson * 10;
        } else if (groupOfWeek.equalsIgnoreCase("regular") && countOfPeople >= 10 && countOfPeople <= 20) {
            totalPrice *= 0.95;
        }
        System.out.printf("Total price: %.2f%n", totalPrice);
    }
}
