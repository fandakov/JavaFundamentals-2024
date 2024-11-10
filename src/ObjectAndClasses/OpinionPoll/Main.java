package ObjectAndClasses.OpinionPoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countPeople = Integer.parseInt(scanner.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 1; i <= countPeople; i++) {

            String[] input = scanner.nextLine().split("\\s+");

            String namePeople = input[0];
            int peopleAge = Integer.parseInt(input[1]);

            if (peopleAge > 30) {
                Person currentPerson = new Person(namePeople, peopleAge);
                people.add(currentPerson);

            }

        }

        for (Person currentPerson : people) {
            System.out.println(currentPerson.getName() + " - " + currentPerson.getAge());

        }

    }
}