package BasicSyntaxAndLoops;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());


        for (int i = 1; i <= number; i++) {


            int sum = 0;
            int numberToCheck = i;

            while (numberToCheck > 0) {
                sum += numberToCheck % 10;
                numberToCheck = numberToCheck / 10;

            }

            boolean isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);

            String formattedBoolean = isSpecialNum ? "True" : "False";

            System.out.printf("%d -> %s%n", i, formattedBoolean);
        }
        scanner.close();


    }
}


