package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> firstDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> secondDeck = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            int firstCard = firstDeck.removeFirst();
            int secondCard = secondDeck.removeFirst();

            if (firstCard > secondCard) {
                firstDeck.add(firstCard);
                firstDeck.add(secondCard);
            } else if (secondCard > firstCard) {
                secondDeck.add(secondCard);
                secondDeck.add(firstCard);
            }
            // Ако картите са равни, и двете се премахват и не се добавят обратно
        }

        // Определяне на победителя и печат на резултата
        if (firstDeck.isEmpty()) {
            int sum = secondDeck.stream().mapToInt(Integer::intValue).sum();
            System.out.println("Second player wins! Sum: " + sum);
        } else {
            int sum = firstDeck.stream().mapToInt(Integer::intValue).sum();
            System.out.println("First player wins! Sum: " + sum);
        }
    }
}
