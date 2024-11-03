package com.kodilla.rps;

import java.util.List;

public class WinningChoice {

    public WinningChoice() {
    }
    public static String getWinChoice(String choice1, String choice2) {
        List<String> competitors = List.of(choice1, choice2);
        String winningChoice = "";
        if (choice1.equals(choice2))
            return winningChoice;
        if (competitors.contains("rock") && competitors.contains("paper"))
            winningChoice = "paper";
        else if (competitors.contains("paper") && competitors.contains("scissors"))
            winningChoice = "scissors";
        else if (competitors.contains("scissors") && competitors.contains("rock"))
            winningChoice = "rock";
        return winningChoice;
    }
}
