package BasicSyntaxAndLoops;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 0; i < number; i++) {
            int oddNumber = 2 * i + 1;
            System.out.println(oddNumber);
            sum += oddNumber;
        }
        System.out.printf("Sum: %d%n", sum);


    }
}
