package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> train = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int maxCapacityWagons = Integer.parseInt(scanner.nextLine());


        List<String> command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());


        while (!command.getFirst().equals("end")) {

            if (command.get(0).equals("Add")) {
                int wagonToAdd = Integer.parseInt(command.get(1));


                train.add(wagonToAdd);
            } else {
                int passengersToAdd = Integer.parseInt(command.get(0));

                for (int i = 0; i < train.size(); i++) {
                    int finalPassCount = passengersToAdd + train.get(i);

                    if (finalPassCount <= maxCapacityWagons) {
                        train.add(i, finalPassCount);
                        train.remove(i + 1);
                        break;

                    }

                }


            }

            command = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        }

        System.out.println(train.toString().replaceAll("[\\[\\],]", ""));
    }
}
