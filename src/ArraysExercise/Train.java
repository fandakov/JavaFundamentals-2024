package ArraysExercise;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int wagonsCount = Integer.parseInt(scanner.nextLine());
        int[] wagons = new int[wagonsCount];

        for (int wagon = 0; wagon < wagonsCount; wagon++) {
            int peopleCount = Integer.parseInt(scanner.nextLine());

            wagons[wagon] = peopleCount;

        }
        int sumOfPeople = 0;

        for (int total : wagons) {
            System.out.print(total + " ");
            sumOfPeople += total;
        }
        System.out.println();

        System.out.print(sumOfPeople);



    }
}
