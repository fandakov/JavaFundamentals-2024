package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AnonymousThreat {

    public static void main(String[] args) {

        /*Anonymous has created a cyber-hyper virus that steals data from the CIA.
        As the lead security developer in the CIA, you have been tasked to analyze the software of the virus and observe its actions on the data.
        The virus is known for its innovative and unbelievably clever technique of merging and dividing data into partitions.

        You will receive a single input line containing STRINGS separated by spaces.
        The strings may contain any ASCII character except whitespace.
        You will then begin receiving commands in one of the following formats:

            •	merge {startIndex} {endIndex}
            •	divide {index} {partitions}

        Whenever you receive the merge command, you must merge all elements from the startIndex to the endIndex. In other words, you should concatenate them.

        Example: {abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}

        If any of the given indexes is out of the array, you must take ONLY the range that is INSIDE the array and merge it.
        Every time you receive the divide command, you must DIVIDE the element at the given index into several small substrings with equal length.
        The count of the substrings should be equal to the given partitions. Example: {abcdef, ghi, jkl} -> divide 0 3 -> {ab, cd, ef, ghi, jkl}
        If the string CANNOT be exactly divided into the given partitions, make all partitions except the LAST with EQUAL LENGTHS, and make the LAST one – the LONGEST.
        Example: {abcd, efgh, ijkl} -> divide 0 3 -> {a, b, cd, efgh, ijkl}
        The input ends when you receive the command "3:1". At that point, you must print the resulting elements, joined by a space.

        Input:
            •	The first input line will contain the array of data.
            •	On the next several input lines, you will receive commands in the format specified above.
            •	The input ends when you receive the command "3:1".
        Output:
            •	As output, you must print a single line containing the array elements, joined by a space.
        Constrains:
            •	The strings in the array may contain any ASCII character except whitespace.
            •	The startIndex and the endIndex will be in the range [-1000, 1000].
            •	The endIndex will ALWAYS be GREATER than the startIndex.
            •	The index in the divide command will ALWAYS be INSIDE the array.
            •	The partitions will be in the range [0, 100].
            •	Allowed working time/memory: 100ms / 16MB.*/

        Scanner scanner = new Scanner(System.in);

        List<String> list = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String input = scanner.nextLine();

        while (!input.equals("3:1")) {
            String[] actions = input.split(" ");
            String action = actions[0];

            switch (action) {
                case "merge" -> mergeIndices(actions, list);
                case "divide" -> divideIndex(actions, list);
            }
            input = scanner.nextLine();
        }
        System.out.println(list.toString().replaceAll("[\\[\\],]", ""));
    }

    private static void mergeIndices(String[] actions, List<String> list) {

        if (list.size() > 1) {
            int startIndex = Math.max(Integer.parseInt(actions[1]), 0);
            int endIndex = Math.min(list.size() - 1, Integer.parseInt(actions[2]));

            for (int index = endIndex; index > startIndex; index--) {
                String newElement = list.get(index - 1) + list.get(index);
                list.set(index - 1, newElement);
                list.remove(index);
            }
        }
    }

    private static void divideIndex(String[] actions, List<String> list) {

        int index = Integer.parseInt(actions[1]);
        int partitions = Integer.parseInt(actions[2]);

        List<String> characters = Arrays.stream(list.get(index).split("")).collect(Collectors.toList());
        list.remove(index);
        int size = characters.size();

        if (characters.size() % partitions == 0) {
            while (!characters.isEmpty()) {
                String newElement = "";
                int newElementCharactersCount = size / partitions;
                while (newElementCharactersCount > 0) {
                    newElement += characters.getFirst();
                    characters.remove(0);
                    newElementCharactersCount--;
                }
                list.add(index, newElement);
                index++;
            }

        } else {

            int newElementSize = characters.size() / partitions;
            int remainder = characters.size() % partitions;
            for (int i = 1; i < partitions; i++) {
                String newElement = "";
                for (int n = 0; n < newElementSize; n++) {
                    newElement += characters.get(0);
                    characters.remove(0);
                }
                if (i + 1 == partitions) {
                    String lastElement = "";
                    while (!characters.isEmpty()) {
                        lastElement += characters.get(0);
                        characters.remove(0);
                    }
                    list.add(index, newElement);
                    list.add(index + 1, lastElement);
                    break;
                } else {
                    list.add(index, newElement);
                }
                index++;
            }
        }
    }
}