package FinalExam;

import java.util.Scanner;

public class Task_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int countInput = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < countInput; i++) {

            String input = scanner.nextLine();

            String regex = "\\|[A-Z]{4,}\\|:#([A-Za-z]+ [A-Za-z]+)#";

            if (input.matches(regex)) {

                String[] inputParts = input.split( ":");

                String boss = inputParts[0].substring(1, inputParts[0].length() - 1);
                String title = inputParts[1].substring(1, inputParts[1].length() - 1);


                System.out.println(boss + ", The " + title);
                System.out.println(">> Strength: " + boss.length());
                System.out.println(">> Armor: " + title.length());
            } else {
                System.out.println("Access denied!");
            }
        }
    }
}
