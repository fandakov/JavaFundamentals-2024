package FinalExam;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_03 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> likesMap = new LinkedHashMap<>();
        Map<String, Integer> commentsMap = new LinkedHashMap<>();

        String input;
        while (!(input = scanner.nextLine()).equals("Log out")) {

            String[] parts = input.split(": ");

            String command = parts[0];
            String username = parts[1];

            switch (command) {
                case "New follower" -> {
                    likesMap.putIfAbsent(username, 0);
                    commentsMap.putIfAbsent(username, 0);
                }
                case "Like" -> {

                    int likes = Integer.parseInt(parts[2]);

                    likesMap.put(username, likesMap.getOrDefault(username, 0) + likes);
                    commentsMap.putIfAbsent(username, 0);
                }
                case "Comment" -> {

                    commentsMap.put(username, commentsMap.getOrDefault(username, 0) + 1);
                    likesMap.putIfAbsent(username, 0);

                }

                case "Blocked" -> {
                    if (likesMap.containsKey(username)) {

                        likesMap.remove(username);
                        commentsMap.remove(username);
                    } else {
                        System.out.println(username + " doesn't exist.");
                    }
                }
            }
        }
        System.out.println(likesMap.size() + " followers");

        for (String user : likesMap.keySet()) {
            int totalLikesAndComments = likesMap.get(user) + commentsMap.get(user);
            System.out.println(user + ": " + totalLikesAndComments);
        }
    }
}



