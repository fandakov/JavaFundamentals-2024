package MethodsExercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());

        int sum = sumDigits(firstNumber,secondNumber);

        int diff = subtractDigits(sum,thirdNumber);

        System.out.println(diff);


    }

    private static int sumDigits (int n, int n2) {
        return n + n2;
    }

    private static int subtractDigits( int n, int n2) {
        return n - n2;
    }

}
