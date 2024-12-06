package BasicSyntaxAndLoops;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOddNumbers = Integer.parseInt(scanner.nextLine());

        int currentNumber = 1;
        int sumOddNumbers = 0;

        for (int i = 0; i < countOddNumbers; i++) {

            System.out.println(currentNumber);
            sumOddNumbers += currentNumber;
            currentNumber += 2;

        }
        System.out.printf("Sum: %d", sumOddNumbers);

    }
}
