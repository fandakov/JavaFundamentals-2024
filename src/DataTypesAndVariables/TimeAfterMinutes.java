package DataTypesAndVariables;

import java.util.Scanner;

public class TimeAfterMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int currentHour = Integer.parseInt(scanner.nextLine());

        int currentMinutes = Integer.parseInt(scanner.nextLine());

        int totalMinutesAfter30Minutes = currentHour * 60 + currentMinutes + 30;

        int totalHours = totalMinutesAfter30Minutes / 60;
        int totalMinutes = totalMinutesAfter30Minutes % 60;

        if (totalHours > 23) {
            totalHours = 0;
        }
        System.out.printf("%d:%02d", totalHours, totalMinutes);


    }
}
