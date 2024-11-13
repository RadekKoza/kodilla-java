package com.kodilla.rps;

import java.util.List;

public class WinningChoice {
    static List<String> toolChoice = List.of("rock", "paper", "scissors");

    public WinningChoice() {
    }
    public static String getWinChoice(int choice1, int choice2) {
        List<Integer> competitors = List.of(choice1, choice2);
        String winningChoice = "";
        if (choice1 == choice2)
            return winningChoice;
        if (competitors.contains(1) && competitors.contains(2))
            winningChoice = "paper";
        else if (competitors.contains(2) && competitors.contains(3))
            winningChoice = "scissors";
        else if (competitors.contains(3) && competitors.contains(1))
            winningChoice = "rock";
        return winningChoice;
    }
}
