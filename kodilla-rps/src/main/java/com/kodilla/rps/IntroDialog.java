package com.kodilla.rps;

import static com.kodilla.rps.Game.scanner;

public class IntroDialog {

    private static String playerName;
    private static int rounds;

    public IntroDialog() {

        System.out.println("Hello! You are going to play rps.");
        System.out.print("Enter Your name: ");

        playerName = scanner.nextLine();

        System.out.print("Enter the number of rounds to win to win the game: ");

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
    }

}