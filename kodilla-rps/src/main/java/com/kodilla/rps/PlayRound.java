package com.kodilla.rps;

import static com.kodilla.rps.Game.player;
import static com.kodilla.rps.WinningChoice.getWinChoice;
import static com.kodilla.rps.WinningChoice.toolChoice;

public class PlayRound {
    private final String playerChoice;
    private static String playerToolChoice;
    private static String compToolChoice;

    public PlayRound(String playerChoice) {
        this.playerChoice = playerChoice;
    }

    public String getWinner() {

        int playerIndexChoice = Integer.parseInt(playerChoice)-1;
        int computerIndexChoice = CompResponse.respond(playerIndexChoice);
        playerToolChoice = toolChoice.get(playerIndexChoice);
        compToolChoice = toolChoice.get(computerIndexChoice);
        String winningChoice = getWinChoice(playerIndexChoice, computerIndexChoice);
        String theWinner = "";

        if (playerIndexChoice == computerIndexChoice)
            theWinner = winningChoice;
        else if (winningChoice == playerToolChoice)
            theWinner = player;
        else if (winningChoice == compToolChoice)
            theWinner = "computer";

        return theWinner;
    }

    public static String getPlayerToolChoice() {
        return playerToolChoice;
    }

    public static String getCompToolChoice() {
        return compToolChoice;
    }
}