package MidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ArcheryTournament_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read initial targets from input
        List<Integer> targets = Arrays.stream(scanner.nextLine().split("\\|"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        double points = 0;
        String command;
        while (!(command = scanner.nextLine()).equals("Game over")) {
            String[] commandParts = command.split("@");
            String action = commandParts[0];

            switch (action) {
                case "Shoot Left", "Shoot Right" -> {
                    int startIndex = Integer.parseInt(commandParts[1]);
                    int length = Integer.parseInt(commandParts[2]);

                        if (startIndex < 0 && startIndex >= targets.size()) {
                            continue;
                        }

                        int currentIndex = startIndex;
                        if (action.equals("Shoot Left")) {
                            currentIndex = (startIndex - length + targets.size()) % targets.size(); // Circular traversal to the left
                        } else { // Shoot Right
                            currentIndex = (startIndex + length) % targets.size(); // Circular traversal to the right
                        }

                        // Shoot at the target
                        if (targets.get(currentIndex) > 0) {
                            points += 5;// Increase points// Decrease target points
                            targets.set(currentIndex, Math.max(0, targets.get(currentIndex) - 5));
                        }
                    }
                case "Reverse" -> Collections.reverse(targets);
            }
        }
        String result = targets.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(" - "));

        System.out.println(result);
        System.out.printf("John finished the archery tournament with %.0f points!", points);


    }
}

