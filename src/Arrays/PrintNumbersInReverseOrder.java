package Arrays;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countNumbers = Integer.parseInt(scanner.nextLine());

        int[] numbers = new int[countNumbers];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());


        }

        for (int reversedNumber = numbers.length - 1; reversedNumber >= 0; reversedNumber--) {

            System.out.print(numbers[reversedNumber] + " ");
        }

    }
}
