package MethodsExercise;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine().toLowerCase();

        vowelsCounter(text);


    }

    private static void vowelsCounter(String text) {

        int count = 0;
        for (char symbol : text.toCharArray()) {

            if (symbol == 'a' || symbol == 'o' || symbol == 'u'
                    || symbol == 'e' || symbol == 'i') {
                count++;

            }

        }

        System.out.println(count);

    }

}
