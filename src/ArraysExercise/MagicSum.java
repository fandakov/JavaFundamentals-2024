package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();
        int magicSum = Integer.parseInt(scanner.nextLine());

        for (int position = 0; position < numbers.length - 1; position++) {
            int currentNumber = numbers[position];


            for (int nexPosition = position + 1; nexPosition <= numbers.length - 1; nexPosition++) {
                int nextNumber = numbers[nexPosition];

                if (currentNumber + nextNumber == magicSum) {
                    System.out.printf("%d %d%n", currentNumber, nextNumber);
                }

            }

        }

    }
}

