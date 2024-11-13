package com.kodilla.rps;

import static com.kodilla.rps.Game.scanner;

public class Dialog {

    private static String playerName;
    private static int rounds;

    public Dialog() {
    }

    String playerChoice = String.valueOf(scanner.nextLine());

    public void intro() {
        System.out.println("Hello! You are going to play rps.");
        System.out.print("Enter Your name: ");
        playerName = scanner.nextLine();

        System.out.print("Enter the number of rounds to win to finish the game: ");
        rounds = scanner.nextInt();

        System.out.println(playerName + "! Some have to win " + rounds + " rounds to finish the game!");
        System.out.println("To play the game you can use the following keys:");
        System.out.println("choose rock: key \"1\"\nchoose paper: key \"2\"\n" +
                "choose scissors: key \"3\"");
        System.out.println("abort game: key \"x\"\nrestart game: key \"n\"\n");
        System.out.println("Start the game. Choose your tool.");
    }

    public static String getPlayerName() {
        return playerName;
    }

    public static int getNumberOfRoundsToWin() {
        return rounds;
    }

    public void playInput() {

        String theWinner = "";
        int playerWins = 0;
        int computerWins = 0;
        int drawNumber = 0;
        boolean end = false;
        while (!end) {

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

            if (theWinner.equals(Dialog.getPlayerName()))
                playerWins++;
            else if (theWinner.equals("computer"))
                computerWins++;
            else
                drawNumber++;

            System.out.println(Dialog.getPlayerName() + " won " + playerWins + "times");
            System.out.println("computer won " + computerWins + "times");
            System.out.println("draw " + drawNumber + "times");

            if (playerWins == Dialog.getNumberOfRoundsToWin() || computerWins == Dialog.getNumberOfRoundsToWin())
                end = true;
        }
    }
}