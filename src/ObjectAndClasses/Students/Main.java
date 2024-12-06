package ObjectAndClasses.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);
            students.add(new Student(firstName, lastName, grade));
        }

        students.sort(Comparator.comparing(Student::getGrade));
        Collections.reverse(students);

        for (Student student : students) {
            System.out.println(student);
        }

    }
}