package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String password = scanner.nextLine();

        boolean isValidNumber = isValidNumber(password);

        if (!isValidNumber) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isContainingDigitsAndLetters = isContainingDigitsAndLetters(password);

        if (!isContainingDigitsAndLetters) {
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isTwoDigits = isTwoDigits(password);

        if (!isTwoDigits) {
            System.out.println("Password must have at least 2 digits");
        }
        if (isValidNumber && isContainingDigitsAndLetters && isTwoDigits) {
            System.out.println("Password is valid");
        }


    }

    private static boolean isValidNumber(String password) {

        return password.length() >= 6 && password.length() <= 10;
    }

    private static boolean isContainingDigitsAndLetters(String password) {
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }

        }
        return true;
    }

    private static boolean isTwoDigits(String password) {

        int digitsCount = 0;
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitsCount++;
            }

        }
        return digitsCount >= 2;
    }
}

