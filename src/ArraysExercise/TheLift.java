package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeople = Integer.parseInt(scanner.nextLine());

        int[] lifts = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        boolean isFullList = true;

        for (int wagons = 0; wagons <= lifts.length - 1; wagons++) {
            int availablePlaces = 4 - lifts[wagons];

            if (availablePlaces > 0) {
                if (availablePlaces > waitingPeople) {
                    lifts[wagons] += waitingPeople;
                    waitingPeople = 0;
                    isFullList = false;
                } else {
                    lifts[wagons] = 4;
                    waitingPeople -= availablePlaces;
                }
            }

        }
        if (!isFullList) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeople > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
        }
        for (int wagon : lifts) {
            System.out.print(wagon + " ");
        }


    }
}
