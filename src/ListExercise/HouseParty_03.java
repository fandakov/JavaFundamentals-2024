package ListExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HouseParty_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countOfCommands = Integer.parseInt(scanner.nextLine());

        List<String> guestsList = new ArrayList<>();

        for (int i = 0; i < countOfCommands; i++) {
            String command = scanner.nextLine();

            String[] commandParts = command.split(" ");
            String name = commandParts[0];

            if (command.contains("is going!")) {
                if (guestsList.contains(name)) {
                    System.out.println(name + " is already in the list!");
                } else {
                    guestsList.add(name);
                }
            } else if (command.contains("is not going")) {
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    System.out.println(name + " is not in the list!");
                }
            }
        }

        for (String guests : guestsList) {
            System.out.println(guests);
        }
    }
}
