package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKegs = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxModel = "";

        for (int kegs = 1; kegs <= countKegs; kegs++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            if (volume > maxVolume) {
                maxVolume = volume;
                maxModel = model;
            }

        }
        System.out.println(maxModel);
    }

}
