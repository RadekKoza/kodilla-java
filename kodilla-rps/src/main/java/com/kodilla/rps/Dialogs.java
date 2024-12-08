package com.kodilla.rps;

import java.util.Scanner;

import static com.kodilla.rps.Game.*;


public class Dialogs {

    public static Scanner scanner = new Scanner(System.in);

    public static String getPlayerName() {
        System.out.println("Hello! You are going to play Rock Paper Scissors.");
        System.out.print("Enter Your name: ");
        String playerName = scanner.nextLine();
        while (playerName.length() < 2) {
            System.out.println("Please enter a valid name - 2 characters at least");
            playerName = scanner.nextLine();
        }
        return playerName;
    }

    public static int getNumberOfRoundsToWin() {
        int roundsNumber = 0;
        System.out.print("Enter the number of winning rounds needed to complete the game: ");
        while (roundsNumber == 0)
            if (!scanner.hasNextInt()) {
                System.out.println("Please enter integer value");
                scanner.nextLine();
            } else {
                roundsNumber = scanner.nextInt();
            }
        System.out.println("Some have to win " + roundsNumber + " rounds to complete the game!");
        return roundsNumber;
    }

    public static void newGame() {
        numberOfRounds = getNumberOfRoundsToWin();
        computerWins = 0;
        playerWins = 0;
        drawNumber = 0;
        theWinner = "";
        roundWinner = "";
    }

    public static void keysToPlay() {
        System.out.println("To play the game choose proper key:\nrock - \"1\"\npaper - \"2\"\n" +
                "scissors - \"3\"");
        System.out.println("abort game: key \"x\"\nrestart game: key \"n\"\n");
    }

    public static String playInput() {
        String playerChoice = scanner.nextLine();
        return playerChoice;
    }

    public static void backToPlay() {
        System.out.println("Coming back to play");
    }

    public static boolean restartGame() {
        System.out.println("Are you sure you want to restart the game?" +
                "\nIf yes enter \"n\" again otherwise enter anything.");
        String confirm = scanner.nextLine();
        if (confirm.equals("n")) {
            System.out.println("New game started!");
            return true;
        } else {
            return false;
        }
    }

    public static boolean endTheGame() {
        System.out.println("Are you sure you want to end the game?" +
                "\nIf yes enter \"x\" again otherwise enter anything");
        String confirm = scanner.nextLine();
        if (confirm.equals("x")) {
            System.out.println("Game is over");
            return true;
        } else {
            return false;
        }
    }

    public static void roundResult() {
        System.out.println(player + " choice is " + PlayRound.getPlayerToolChoice());
        System.out.println("Computer choice is " + PlayRound.getCompToolChoice());
        System.out.println("The round winner is " + roundWinner);
        System.out.println(player + " won " + playerWins + " times");
        System.out.println("computer won " + computerWins + " times");
        System.out.println("draw " + drawNumber + " times");
    }

    public static void finalResult() {
        System.out.println("\nFinally:");
        System.out.println(player + " won " + playerWins + " times");
        System.out.println("computer won " + computerWins + " times");
        System.out.println("draw " + drawNumber + " times");
        System.out.println("The winner is " + theWinner + "!");
    }

    public static boolean whatNext() {
        System.out.println("If you want to quit the game enter \"x\". If you want to play new game enter anything.");
        boolean end = false;
        if (!scanner.nextLine().equals("x")) {
            newGame();
        } else {
            end = true;
        }
        return end;
    }
}