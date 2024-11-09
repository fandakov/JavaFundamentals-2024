package ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine()
                        .split(" ")).mapToInt(Integer::parseInt)
                .toArray();

        for (int position = 0; position <= numbers.length - 1; position++) {
            int currentNumber = numbers[position];

            int leftSum = 0;
            int rightSum = 0;

            for (int leftPosition = 0; leftPosition < position; leftPosition++) {
                leftSum += numbers[leftPosition];

            }
            for (int rightPosition = position + 1; rightPosition <= numbers.length - 1; rightPosition++) {
                rightSum += numbers[rightPosition];
            }
            if (leftSum == rightSum) {
                System.out.println(position);
                return;
            }
        }
        System.out.println("no");


    }
}
/*Write a program that determines if an element exists in the array such that the sum of the elements on its left
is equal to the sum of the elements on its right.
If there are no elements to the left/right, their sum is considered to be 0.
Print the index that satisfies the required condition or "no" if there is no such index.
 */