package AssociativeArraysExercises;

import java.util.*;

public class Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<String>> courses = new LinkedHashMap<>();

        String command = scanner.nextLine();
        while (!command.equals("end")) {

            String[] action = command.split(" : ");

            String courseName = action[0];
            String studentName = action[1];

            courses.putIfAbsent(courseName, new ArrayList<>());
            courses.get(courseName).add(studentName);

            command = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {

            String courseName = entry.getKey();
            List<String> students = entry.getValue();

            System.out.printf("%s: %s%n", courseName, students.size());
            students.forEach(name -> System.out.printf("-- %s%n", name));
        }

    }
}
