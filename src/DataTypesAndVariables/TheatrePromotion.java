package DataTypesAndVariables;

import java.util.Scanner;

public class TheatrePromotion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        int price = 0;
        boolean isValid = true;

        switch (typeOfDay) {
            case "Weekday" -> {
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 12;
                } else if (age > 18 && age <= 64) {
                    price = 18;
                } else {
                    isValid = false;
                }
            }
            case "Weekend" -> {
                if ((age >= 0 && age <= 18) || (age > 64 && age <= 122)) {
                    price = 15;
                } else if (age > 18 && age <= 64)
                    price = 20;
                else {
                    isValid = false;
                }
            }
            case "Holiday" -> {
                if (age >= 0 && age <= 18) {
                    price = 5;
                } else if (age > 18 && age <= 64) {
                    price = 12;
                } else if (age > 64 && age <= 122) {
                    price = 10;
                } else {
                    isValid = false;


                }
            }
        }
        if (isValid) {
            System.out.printf("%d$", price);
        } else {
            System.out.println("Error!");
        }

    }
}