package AssociativeArraysExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> parkingData = new LinkedHashMap<>();

        int commandCount = Integer.parseInt(scanner.nextLine());

        for (int count = 1; count <= commandCount; count++) {
            String command = scanner.nextLine();

            String[] commandParts = command.split(" ");

            String commandName = commandParts[0];
            String username = commandParts[1];

            if (commandName.equals("register")) {
                String licenseNumber = commandParts[2];

                if (parkingData.containsKey(username)) {
                    System.out.println("ERROR: already registered with plate number " + parkingData.get(username));
                } else {
                    parkingData.put(username, licenseNumber);
                    System.out.printf("%s registered %s successfully%n", username, licenseNumber);
                }


            } else if (commandName.equals("unregister")) {

                if (!parkingData.containsKey(username)) {
                    System.out.printf("ERROR: user %s not found%n", username);
                } else {
                    parkingData.remove(username);
                    System.out.printf("%s unregistered successfully%n", username);
                }
            }
        }
        parkingData.entrySet().forEach(entry -> System.out.println(entry.getKey() + " => " + entry.getValue()));
    }
}


