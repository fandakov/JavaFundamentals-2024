package DataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballs = Integer.parseInt(scanner.nextLine());

        double maxValue = Double.MIN_VALUE;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuality = 0;

        for (int maddenSnowballs = 1; maddenSnowballs <= snowballs; maddenSnowballs++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            double snowballValue = Math.pow((double) snowballSnow / snowballTime, snowballQuality);

            if (snowballValue > maxValue) {
                maxValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuality = snowballQuality;
            }

        }
        if (snowballs > 0) {
            System.out.printf("%d : %d = %.0f (%d)%n", bestSnowballSnow, bestSnowballTime, maxValue, bestSnowballQuality);
        }

    }
}
