package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maxLiters = 255;
        int count = Integer.parseInt(scanner.nextLine());

        int currentLitters = 0;

        for (int i = 1; i <= count; i++) {
            int pouredLitters = Integer.parseInt(scanner.nextLine());
            currentLitters += pouredLitters;

            if (currentLitters > maxLiters) {
                System.out.println("Insufficient capacity!");
                currentLitters -= pouredLitters;
            }

        }
        System.out.println(currentLitters);
    }
}

