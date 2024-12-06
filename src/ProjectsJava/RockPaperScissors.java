package ProjectsJava;

import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class RockPaperScissors {


        public static void main(String[] args) {

            System.out.println("Choose [r]ock, [p]aper or [s]cissors:");
            final String ROCK = "rock";
            final String PAPER = "paper";
            final String SCISSORS = "scissors";
            Scanner scanner = new Scanner(System.in);
            String playerInput = scanner.nextLine();
            String playerMove = "";

            while (true) {
                if (playerInput.equals("r") || playerInput.equals("rock")) {
                    playerMove = "rock";
                    break;
                } else if (playerInput.equals("p") || playerInput.equals("paper")) {
                    playerMove = "paper";
                    break;
                } else if (playerInput.equals("s") || playerInput.equals("scissors")) {
                    playerMove = "scissors";
                    break;
                } else {
                    System.out.println("Invalid input. Please try again...");
                    playerInput = scanner.nextLine();
                    continue;
                }
            }

            Random random = new Random();
            int randomNumber = random.nextInt(3);
            String computerMove = switch (randomNumber) {
                case 0 -> "rock";
                case 1 -> "paper";
                case 2 -> "scissors";
                default -> "";
            };
            System.out.printf("You chose %s.%n", playerMove);
            System.out.printf("The computer chose %s.%n", computerMove);
            String result = "";
            if (playerMove.equals(computerMove)) {
                result = "Draw..";
            } else if (playerMove.equals("rock") && computerMove.equals("scissors") ||
                    playerMove.equals("paper") && computerMove.equals("rock") ||
                    playerMove.equals("scissors") && computerMove.equals("paper")) {
                result = "You win!";
            } else {
                result = "You lose!";
            }
            System.out.printf("Outcome: %s", result);
        }
    }