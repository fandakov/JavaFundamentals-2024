package MethodsExercise;

import java.util.Scanner;

public class TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int number = 1; number <= n; number++) {

            boolean isValidSum = checkSumDigitsIsDivisibleBy8(number);

            boolean isContainingOddDigits = containsOddDigit(number);

            if (isValidSum && isContainingOddDigits) {
                System.out.println(number);
            }


        }

    }

    public static boolean checkSumDigitsIsDivisibleBy8(int number) {
        int sum = 0;
        while (number > 0) {
            int lastDigit = number % 10;
            sum += lastDigit;
            number /= 10;
        }
        return sum % 8 == 0;
    }

    private static boolean containsOddDigit(int number) {
        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                number /= 10;
            }
        }
        return false;
    }

}
