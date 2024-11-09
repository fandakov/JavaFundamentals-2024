package DataTypesAndVariables;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peopleCount = Integer.parseInt(scanner.nextLine());
        int capacityOfElevator = Integer.parseInt(scanner.nextLine());

        int coursesOfElevator = (int) Math.ceil((double) peopleCount / capacityOfElevator);

        System.out.println(coursesOfElevator);

    }
}
