package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class MagicCards_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> originalCards = Arrays.stream(scanner.nextLine().split(":")).collect(Collectors.toList());
        List<String> newDeck = new ArrayList<>();

        String command = scanner.nextLine();
        while (!command.equals("Ready")) {
            String[] commandData = command.split(" ");
            String action = commandData[0];

            switch (action) {
                case "Add" -> {
                    String cardToAdd = commandData[1];
                    if (originalCards.contains(cardToAdd)) {
                        newDeck.add(cardToAdd);
                    } else {
                        System.out.println("Card not found.");
                    }
                }
                case "Insert" -> {
                    String cardToInsert = commandData[1];
                    int insertIndex = Integer.parseInt(commandData[2]);
                    if (originalCards.contains(cardToInsert) && checkIfIsValidIndex(insertIndex, newDeck.size())) {
                        newDeck.add(insertIndex, cardToInsert);
                    } else {
                        System.out.println("Error!");
                    }
                }
                case "Remove" -> {
                    String cardToRemove = commandData[1];
                    if (newDeck.remove(cardToRemove)) {

                    } else {
                        System.out.println("Card not found.");
                    }
                }
                case "Swap" -> {
                    String card1 = commandData[1];
                    String card2 = commandData[2];
                    int index1 = newDeck.indexOf(card1);
                    int index2 = newDeck.indexOf(card2);
                    if (index1 != -1 && index2 != -1) {
                        String temp = newDeck.get(index1);
                        newDeck.set(index1, newDeck.get(index2));
                        newDeck.set(index2, temp);
                    }
                }
                case "Shuffle" -> Collections.reverse(newDeck);
                default -> System.out.println("Invalid command.");
            }

            command = scanner.nextLine();
        }


        System.out.println(String.join(" ", newDeck));
    }

    private static boolean checkIfIsValidIndex(int index, int lastIndex) {
        return (index >= 0 && index < lastIndex);
    }
}
