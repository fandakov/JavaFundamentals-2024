package ObjectAndClasses.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<OrderByAge> people = new ArrayList<>();
        String command = scanner.nextLine();

        while (!command.equals("End")) {
            String[] actions = command.split(" ");
            String name = actions[0];
            String id = actions[1];
            int age = Integer.parseInt(actions[2]);

            people.add(new OrderByAge(name, id, age));


            command = scanner.nextLine();
        }

        people.sort(Comparator.comparingInt(person -> person.age));

        for (OrderByAge peopleDetails : people) {
            System.out.println(peopleDetails);
        }


    }
}