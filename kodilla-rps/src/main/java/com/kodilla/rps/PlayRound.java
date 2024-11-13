package com.kodilla.rps;

import static com.kodilla.rps.WinningChoice.toolChoice;

public class PlayRound {
    private final String playerChoice;

    public PlayRound(String playerChoice) {
        this.playerChoice = playerChoice;
    }
    public String getWinner() {

        int playerIndexChoice = Integer.parseInt(playerChoice)-1;
        int computerIndexChoice = CompResponse.respond(playerChoice)-1;
        String playerToolChoice = toolChoice.get(playerIndexChoice);
        String compToolChoice = toolChoice.get(computerIndexChoice);
        String winningChoice = WinningChoice.getWinChoice(playerIndexChoice, computerIndexChoice);
        String theWinner = "";

        if (playerIndexChoice == computerIndexChoice) {
            theWinner = "draw";
        }
        else if (winningChoice.equals(playerToolChoice))
            theWinner = Dialog.getPlayerName();
        else if (winningChoice.equals(compToolChoice))
            theWinner = "computer";

        System.out.println("Your choice is " + playerToolChoice);
        System.out.println("Computer choice is " + compToolChoice);
        return theWinner;
    }
}