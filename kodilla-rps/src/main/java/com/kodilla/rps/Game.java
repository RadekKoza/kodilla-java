package com.kodilla.rps;

import java.util.List;
import java.util.Scanner;

public class Game {
    static Scanner scanner = new Scanner(System.in);
    static List<String> toolChoice = List.of("rock", "paper", "scissors");

    public static void main(String[] args) {

        IntroDialog introDialog = new IntroDialog();

        String theWinner = "";
        int playerWins = 0;
        int computerWins = 0;
        int drawNumber = 0;
        boolean end = false;
        while (!end) {

            String playerChoice = String.valueOf(scanner.nextLine());

            switch (playerChoice) {
                case "1":
                case "2":
                case "3": {
                    PlayRound playRound = new PlayRound(playerChoice);
                    theWinner = playRound.getWinner();
                }
                break;

                case "n":
                    System.out.println("Are you sure you want to restart the game?" +
                            "\nIf yes enter \"n\" again otherwise enter anything.");
                    if (scanner.nextLine().equals("n")) {
                        System.out.println("Starting new game.");
                        computerWins = 0;
                        playerWins = 0;
                    } else {
                        System.out.println("Coming back");
                    }
                    break;
                case "x": {
                    System.out.println("Are you sure you want to end the game?" +
                            "\nIf yes enter \"x\" again otherwise enter anything");
                    if (scanner.nextLine().equals("x")) {
                        System.out.println("Game is over");
                        end = true;
                    } else {
                        System.out.println("Coming back");
                    }
                    break;
                }
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            if (theWinner.equals(IntroDialog.getPlayerName()))
                playerWins++;
            else if (theWinner.equals("computer"))
                computerWins++;
            else
                drawNumber++;

            System.out.println(IntroDialog.getPlayerName() + " won " + playerWins + "times");
            System.out.println("computer won " + computerWins + "times");
            System.out.println("draw " + drawNumber + "times");

            if (playerWins == IntroDialog.getNumberOfRoundsToWin() || computerWins == IntroDialog.getNumberOfRoundsToWin())
                end = true;
        }
    }
}