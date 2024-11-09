package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PokemonDoNotGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> pokemon = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sumOfAllElements = 0;

        while (!pokemon.isEmpty()) {

            int position = Integer.parseInt(scanner.nextLine());

            if (position < 0) {
                int removedElement = pokemon.getFirst();
                pokemon.removeFirst();

                sumOfAllElements += removedElement;

                int lastElement = pokemon.getLast();
                pokemon.addFirst(lastElement);

                modifyList(pokemon, removedElement);

            } else if (position > pokemon.size() - 1) {

                int lastElement = pokemon.getLast();

                pokemon.removeLast();

                sumOfAllElements += lastElement;

                int firstElement = pokemon.getFirst();

                pokemon.add(firstElement);

                modifyList(pokemon, lastElement);

            } else {// index >= 0 && index <= pokemonList.size() - 1

                int removedElement = pokemon.get(position);

                sumOfAllElements += removedElement;
                pokemon.remove(position);

                modifyList(pokemon, removedElement);

            }


        }

        System.out.println(sumOfAllElements);


    }

    private static void modifyList(List<Integer> pokemon, int removedElement) {

        for (int i = 0; i < pokemon.size(); i++) {
            int currentElement = pokemon.get(i);

            if (currentElement <= removedElement) {
                currentElement += removedElement;
            } else {
                currentElement -= removedElement;
            }
            pokemon.set(i, currentElement);

        }
    }
}
