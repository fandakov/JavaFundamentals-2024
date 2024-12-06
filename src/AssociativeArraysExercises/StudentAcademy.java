package AssociativeArraysExercises;


import java.util.*;

public class StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, List<Double>> studentGrades = new LinkedHashMap<>();

        int countStudents = Integer.parseInt(scanner.nextLine());

        for (int n = 1; n <= countStudents ; n++) {
            String studentsName = scanner.nextLine();
            double grades = Double.parseDouble(scanner.nextLine());

            if (studentGrades.containsKey(studentsName)) {
                List<Double> currentGrades = studentGrades.get(studentsName);
                currentGrades.add(grades);
            } else {
                studentGrades.put(studentsName, new ArrayList<>());
                studentGrades.get(studentsName).add(grades);
            }
        }

        Map<String, Double> studentAverageGrade = new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGrades.entrySet()) {

            String studentName = entry.getKey();
            List<Double> grades = entry.getValue();

            double averageGrade = grades.stream().mapToDouble(d -> d).average().orElse(0.0);

            if (averageGrade >= 4.50) {
                studentAverageGrade.put(studentName, averageGrade);
            }

        }

        studentAverageGrade.entrySet().forEach(entry -> System.out.printf("%s -> %.2f%n",entry.getKey(),entry.getValue()));
    }
}
