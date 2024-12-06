package ListExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        int bombNumber = scanner.nextInt();
        int power = scanner.nextInt();

        while (numbers.contains(bombNumber)) {
            int index = numbers.indexOf(bombNumber);

                int start = Math.max(0, index - power);
                int end = Math.min(numbers.size() - 1, index + power);

            for (int i = end; i >= start ; i--) {
                numbers.remove(i);
            }
        }

        int sum = 0;
        for (Integer number : numbers) {
            sum +=number;
        }

        System.out.println(sum);
    }
}
