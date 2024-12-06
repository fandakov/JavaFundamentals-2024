package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] number = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int countRotations = Integer.parseInt(scanner.nextLine());

        for (int rotations = 1; rotations <= countRotations; rotations++) {

            int firstNumber = number[0];

            for (int position = 0; position < number.length - 1; position++) {
                number[position] = number[position + 1];

            }
            number[number.length - 1] = firstNumber;

        }
        for (int numbers : number) {
            System.out.print(numbers + " ");
        }

    }
}

