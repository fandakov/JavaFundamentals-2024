package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<Integer> numberList = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());


        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] commandData = command.split("\\s+");

            String commandName = commandData[0];

            switch (commandName) {

                case "Add" -> {
                    int numberToAdd = Integer.parseInt(commandData[1]);
                    numberList.add(numberToAdd);


                }
                case "Insert" -> {
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int index = Integer.parseInt(commandData[2]);


                    boolean isValidIndex = checkIfIsValidIndex(index, numberList.size() - 1);

                    if (isValidIndex) {
                        numberList.add(index, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }


                }
                case "Remove" -> {
                    int numberToRemove = Integer.parseInt(commandData[1]);

                    boolean isValidIndex = checkIfIsValidIndex(numberToRemove, numberList.size() - 1);

                    if (isValidIndex) {
                        numberList.remove(numberToRemove);
                    } else {
                        System.out.println("Invalid index");
                    }


                }
                case "Shift" -> {

                    String shiftType = commandData[1];
                    int count = Integer.parseInt(commandData[2]);

                    if (shiftType.equals("left")) {
                        shiftLeft(numberList, count);
                    } else if (shiftType.equals("right")) {
                        shiftRight(numberList, count);
                    }
                }
            }

            command = scanner.nextLine();
        }

        for (int numbers : numberList) {
            System.out.print(numbers + " ");
        }

    }

    public static void shiftLeft(List<Integer> numbers, int count) {

        for (int i = 1; i <= count; i++) {
            int firstElement = numbers.getFirst();
            numbers.add(firstElement);
            numbers.removeFirst();


        }


    }

    public static void shiftRight(List<Integer> numbers, int count) {

        for (int i = 1; i <= count; i++) {

            int lastNumber = numbers.getLast();

            numbers.addFirst(lastNumber);
            numbers.removeLast();

        }

    }

    private static boolean checkIfIsValidIndex(int index, int lastIndex) {

        return (index >= 0 && index <= lastIndex);


    }


}

