package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("end")) {
            String[] commandNumbers = command.split(" ");

            String commandAction = commandNumbers[0];

            switch (commandAction) {

                case "Delete" -> {
                    int elementToDelete = Integer.parseInt(commandNumbers[1]);

                    deleteElement2(numbers, elementToDelete);
                }
                case "Insert" -> {
                    int elementToInsert = Integer.parseInt(commandNumbers[1]);
                    int position = Integer.parseInt(commandNumbers[2]);

                    insertElement(numbers, elementToInsert, position);
                }
            }
            command = scanner.nextLine();
        }

        for (int num : numbers) {
            System.out.print(num + " ");

        }


    }

    public static void deleteElement2(List<Integer> numbers, int element) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == element) {
                numbers.remove(i);
                i--;
            }
        }
    }


    /*public static void deleteElement(List<Integer> numbers, int element) {
        numbers.removeIf(num -> num == element);
    }
*/
    public static void insertElement(List<Integer> numbers, int element, int position) {
        if (position >= 0 && position <= numbers.size() - 1) {
            numbers.add(position, element);
        } else if (position == numbers.size()) {
            numbers.add(element);
        }
    }
}
