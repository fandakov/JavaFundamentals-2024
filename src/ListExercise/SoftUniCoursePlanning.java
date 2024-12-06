package ListExercise;

import java.util.*;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> data = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("course start")) {
            String[] parts = command.split(":");
            String inputs = parts[0];
            String lessonTitle = parts[1];

            switch (inputs) {
                case "Add" -> {
                    if (!data.contains(lessonTitle)) {
                        data.add(lessonTitle);
                    }
                }
                case "Insert" -> {
                    int index = Integer.parseInt(parts[2]);
                    if (!data.contains(lessonTitle) && index >= 0 && index < data.size()) {
                        data.add(index, lessonTitle);
                    }
                }
                case "Remove" -> {
                    removeLessonAndExercise(data, lessonTitle);
                }

                case "Swap" -> {
                    String lessonTitle2 = parts[2];
                    swapLessons(data, lessonTitle, lessonTitle2);
                }
                case "Exercise" -> {
                    addExercise(data, lessonTitle);
                }
            }

            command = scanner.nextLine();
        }

        for (int i = 0; i < data.size(); i++) {
            System.out.println((i + 1) + "." + data.get(i));
        }

    }

    private static void removeLessonAndExercise(List<String> data, String lessonTitle) {
        data.remove(lessonTitle);
        data.remove(lessonTitle + "-Exercise");
    }

    private static void swapLessons(List<String> data, String lessonTitle1, String lessonTitle2) {
        int index1 = data.indexOf(lessonTitle1);
        int index2 = data.indexOf(lessonTitle2);

        if (index1 != -1 && index2 != -1) {

            data.set(index1, lessonTitle2);
            data.set(index2, lessonTitle1);


            if (data.contains(lessonTitle1 + "-Exercise")) {
                data.remove(lessonTitle1 + "-Exercise");
                data.add(index2 + 1, lessonTitle1 + "-Exercise");
            }
            if (data.contains(lessonTitle2 + "-Exercise")) {
                data.remove(lessonTitle2 + "-Exercise");
                data.add(index1 + 1, lessonTitle2 + "-Exercise");
            }
        }
    }

    private static void addExercise(List<String> data, String lessonTitle) {
        if (data.contains(lessonTitle) && !data.contains(lessonTitle + "-Exercise")) {
            int lessonIndex = data.indexOf(lessonTitle);
            data.add(lessonIndex + 1, lessonTitle + "-Exercise");
        } else if (!data.contains(lessonTitle)) {
            data.add(lessonTitle);
            data.add(lessonTitle + "-Exercise");
        }
    }
}

