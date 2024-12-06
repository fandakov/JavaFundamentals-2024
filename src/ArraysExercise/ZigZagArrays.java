package ArraysExercise;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countRows = Integer.parseInt(scanner.nextLine());

        int[] firstArray = new int[countRows];
        int[] secondArray = new int[countRows];


        for (int rows = 1; rows <= countRows; rows++) {
            String input = scanner.nextLine();

            int firstNumber = Integer.parseInt(input.split(" ")[0]);
            int secondNumber = Integer.parseInt(input.split(" ")[1]);

            if (rows % 2 == 0) {
                secondArray[rows - 1] = firstNumber;
                firstArray[rows - 1] = secondNumber;

            } else {
                firstArray[rows - 1] = firstNumber;
                secondArray[rows - 1] = secondNumber;
            }

        }
        for (int number : firstArray) {
            System.out.print(number + " ");
        }

        System.out.println();

        for (int number : secondArray) {
            System.out.print(number + " ");
        }

    }
}
