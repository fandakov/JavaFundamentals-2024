package MethodsExercise;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());

        long firstFactorial = calculateFactorial(firstNumber);

        long secondFactorial = calculateFactorial(secondNumber);

        double result = firstFactorial * 1.0 / secondFactorial;

        System.out.printf("%.2f", result);



    }

    public static long calculateFactorial (int n1) {

        long fact = 1;
        for (int i = 1; i <= n1; i++) {
            fact = fact * i;

        }
        return fact;

    }


}
