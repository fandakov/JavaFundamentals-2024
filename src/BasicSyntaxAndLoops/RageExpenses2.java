package BasicSyntaxAndLoops;

import java.util.Scanner;

public class RageExpenses2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLostGames = Integer.parseInt(scanner.nextLine());
        double headsetPrice = Double.parseDouble(scanner.nextLine());
        double mousePrice = Double.parseDouble(scanner.nextLine());
        double keyboardPrice = Double.parseDouble(scanner.nextLine());
        double displayPrice = Double.parseDouble(scanner.nextLine());

        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;

        for (int game = 1; game <= countLostGames; game++) {
            if (game % 2 == 0) {
                headsetCount++;
            }
            if (game % 3 == 0) {
                mouseCount++;
            }
            if (game % 6 == 0) {
                keyboardCount++;
            }
            if (game % 12 == 0) {
                displayCount++;
            }
        }

        double totalPrice = (headsetCount * headsetPrice)
                + (mouseCount * mousePrice)
                + (keyboardCount * keyboardPrice)
                + (displayCount * displayPrice);
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);


    }
}
