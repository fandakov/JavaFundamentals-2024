package FinalExam;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();


        String command = scanner.nextLine();
        while (!command.equals("Complete")) {

            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {

                case "Make" -> {

                    int index = Integer.parseInt(commandParts[2]);

                    if (index >= 0 && index < password.length()) {

                        char[] passwordChars = password.toCharArray();

                        if (commandParts[1].equals("Upper")) {
                            passwordChars[index] = Character.toUpperCase(passwordChars[index]);

                        } else if (commandParts[1].equals("Lower")) {
                            passwordChars[index] = Character.toLowerCase(passwordChars[index]);
                        }
                        password = new String(passwordChars);
                        System.out.println(password);
                    }

                }
                case "Insert" -> {

                    int index = Integer.parseInt(commandParts[1]);

                    if (index >= 0 && index <= password.length()) {

                        char charToInsert = commandParts[2].charAt(0);
                        password = new StringBuilder(password).insert(index, charToInsert).toString();
                        System.out.println(password);
                    }
                }
                case "Replace" -> {

                    char oldChar = commandParts[1].charAt(0);

                    int value = Integer.parseInt(commandParts[2]);

                    if (password.contains(Character.toString(oldChar))) {
                        char newChar = (char) (oldChar + value);
                        password = password.replace(oldChar, newChar);
                        System.out.println(password);
                    }
                }
                case "Validation" -> {
                    validatePassword(password);
                }
            }
            command = scanner.nextLine();
        }


    }

    private static void validatePassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long!");
        }
        if (!password.matches("[A-Za-z0-9_]+")) {
            System.out.println("Password must consist only of letters, digits and _!");
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must consist at least one uppercase letter!");
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must consist at least one lowercase letter!");
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must consist at least one digit!");
        }
    }
}
/*
package FinalExam;

import java.util.Scanner;

public class Task_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder password = new StringBuilder(scanner.nextLine());

        String command = scanner.nextLine();
        while (!command.equals("Complete")) {

            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {

                case "Make" -> {
                    int index = Integer.parseInt(commandParts[2]);

                    if (index >= 0 && index < password.length()) {
                        char currentChar = password.charAt(index);

                        if (commandParts[1].equals("Upper")) {
                            password.setCharAt(index, Character.toUpperCase(currentChar));
                        } else if (commandParts[1].equals("Lower")) {
                            password.setCharAt(index, Character.toLowerCase(currentChar));
                        }

                        System.out.println(password);
                    }
                }

                case "Insert" -> {
                    int index = Integer.parseInt(commandParts[1]);

                    if (index >= 0 && index <= password.length()) {
                        char charToInsert = commandParts[2].charAt(0);
                        password.insert(index, charToInsert);
                        System.out.println(password);
                    }
                }

                case "Replace" -> {
                    char oldChar = commandParts[1].charAt(0);
                    int value = Integer.parseInt(commandParts[2]);

                    if (password.toString().contains(Character.toString(oldChar))) {
                        char newChar = (char) (oldChar + value);

                        for (int i = 0; i < password.length(); i++) {
                            if (password.charAt(i) == oldChar) {
                                password.setCharAt(i, newChar);
                            }
                        }

                        System.out.println(password);
                    }
                }

                case "Validation" -> validatePassword(password.toString());
            }
            command = scanner.nextLine();
        }
    }

    private static void validatePassword(String password) {
        if (password.length() < 8) {
            System.out.println("Password must be at least 8 characters long!");
        }
        if (!password.matches("[A-Za-z0-9_]+")) {
            System.out.println("Password must consist only of letters, digits and _!");
        }
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("Password must consist at least one uppercase letter!");
        }
        if (!password.matches(".*[a-z].*")) {
            System.out.println("Password must consist at least one lowercase letter!");
        }
        if (!password.matches(".*\\d.*")) {
            System.out.println("Password must consist at least one digit!");
        }
    }
}

 */